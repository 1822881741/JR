package com.jr.erp.bill.purchase.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.service.impl.IFileUploadService;
import com.jr.erp.bill.purchase.dao.BillPurchaseItemMapper;
import com.jr.erp.bill.purchase.entity.BillPurchase;
import com.jr.erp.bill.purchase.entity.BillPurchaseItem;
import com.jr.erp.bill.purchase.entity.BillPurchaseItemExample;
import com.jr.erp.bill.purchase.service.IBillPurchaseService;
import com.jr.erp.bus.stock.service.IProductStockService;
import com.jr.erp.sys.entity.SysPurchaseSecheme;
import com.jr.erp.sys.entity.SysPurchaseSechemeItem;
import com.jr.erp.sys.service.ISysPurchaseSechemeService;
import com.jr.erp.sys.set.entity.Param;
import com.jr.erp.sys.set.service.IParamService;

@Service(value="billPurchaseServiceImpl")
public class BillPurchaseServiceImpl extends AbstractBaseService<BillPurchase> implements IBillPurchaseService
{

    @Autowired
    private  BillPurchaseItemMapper itemMapper;
    
    @Autowired
    ISysPurchaseSechemeService sysPurchaseSechemeService;
    
    @Autowired
    IFileUploadService fileUploadService;
    
    @Autowired
    IParamService paramService;
    
    @Autowired
    IProductStockService productStockService;
    
    @Override
    public List<JSONObject> parseImportExcel(String companyNo, Integer sechemeId, MultipartFile file)
    {
        try
        {
            List<List<String>> excelData  = fileUploadService.excelFileUpload(file, companyNo);
            List<JSONObject>  dataList = convertExcelData(excelData, sechemeId);
            return dataList;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    private List<JSONObject> convertExcelData(List<List<String>> result, Integer sechemeId)
    {
        List<JSONObject> goodsListVo = new ArrayList<JSONObject>();
        SysPurchaseSecheme secheme = sysPurchaseSechemeService.getById(sechemeId);
        List<SysPurchaseSechemeItem>  itemList= secheme.getItemList();
        // 如果是石料属性
        if (CollectionUtils.isNotEmpty(result))
        {
            // 只取第一个sheet的内容
            int index = 0;
            for (List<String> rowData : result)
            {
                // 忽略表头
                if (index == 0)
                {
                    index++;
                } else
                {
                    JSONObject jsonObject = new JSONObject();
                    try
                    {
                        // 循环方案中设置的所有列
                        for (SysPurchaseSechemeItem item : itemList)
                        {
                            Integer orderIndex = item.getOrderColumn();
                            if (orderIndex != null && orderIndex != 0)
                            {
                                String excelColumnData = StringUtils.isNotEmpty(rowData.get(orderIndex - 1)) ? rowData.get(orderIndex - 1) : "";
                                if(StringUtils.isEmpty(excelColumnData))
                                {
                                    continue;
                                }
                                Object resultObj = null;
                                // 整数类型
                                if (item.getParamType() == 1)
                                {
                                   
                                    resultObj =  NumberUtils.isNumber(excelColumnData)?(int)NumberUtils.toDouble(excelColumnData):0;
                                }
                                // double类型
                                else if (item.getParamType() == 2)
                                {
                                    double _value = 0;
                                    try
                                    {
                                        if(StringUtils.isNotEmpty(excelColumnData))
                                        {
                                            _value = NumberUtils.isNumber(excelColumnData)?NumberUtils.toDouble(excelColumnData):0;
                                        }
                                    } catch (Exception e)
                                    {
                                        e.printStackTrace();
                                        _value = 0;
                                    }
                                    if (null != item.getDigits())
                                    {
                                        resultObj = String.format("%." + item.getDigits() + "f", _value);
                                    } else
                                    {
                                        resultObj = String.format("%.2f", _value);
                                    }
                                }
                                // 通用类型
                                else if (item.getParamType() == 3)
                                {
                                    resultObj = excelColumnData;
                                }
                                // 字符串类型
                                else
                                {
                                    resultObj = excelColumnData;
                                }
                                if (resultObj != null)
                                {
                                    jsonObject.put(item.getBeanColumn(), resultObj);
                                }
                            }
                        }
                        goodsListVo.add(jsonObject);
                        index++;
                    } catch (Exception e)
                    {
                        jsonObject.put("msg", "解析行失败，请确认excel格式是否正确，或选择的策略是否正确");
                        goodsListVo.add(jsonObject);
                        e.printStackTrace();
                    }
                }
            }
        }
        return goodsListVo;
    }

    @Override
    public BillPurchase saveImportBill(BillPurchase billPurchase)
    {
        this.insert(billPurchase);
        for (BillPurchaseItem temp : billPurchase.getItemList())
        {
            temp.setBillId(billPurchase.getId());
            temp.setCompanyNo(billPurchase.getCompanyNo());
            itemMapper.insert(temp);
        }
        return billPurchase;
    }

    @Override
    public void saveBillAudit(BillPurchase billPurchase)
    {
        Param param= paramService.getParam(billPurchase.getCompanyNo(),billPurchase.getAreaCode(),"purchase","isAudit");
        
//        this.updateBillInfo(billPurchase);
//        
//        this.updateBillSummary(billPurchase.getId());

        BillPurchaseItemExample itemExample = new BillPurchaseItemExample();
        itemExample.createCriteria().andCompanyNoEqualTo(billPurchase.getCompanyNo()).andBillIdEqualTo(billPurchase.getId());
        List<BillPurchaseItem> itemList = (List) itemMapper.selectByExample(itemExample);
        
        //进入在途仓库
        if(StringUtils.equals(param.getParamValue() , "1"))
        {
            String counterCode = billPurchase.getAreaCode()+"001";
            productStockService.addPurchaseStock(billPurchase, counterCode, 10);
            // TODO websocket 发送信息到首页
        }
        
        this.updateByPrimaryKey(billPurchase);
    }
}