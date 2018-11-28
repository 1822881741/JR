package com.jr.erp.bill.transfer.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.service.impl.IFileUploadService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.JodaUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.bill.transfer.entity.BillTransfer;
import com.jr.erp.bill.transfer.entity.BillTransferItem;
import com.jr.erp.bill.transfer.service.IBillTransferService;
import com.jr.erp.bill.utils.Constance;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.utils.service.IBillNoGeneratorService;

@Controller
@RequestMapping("/transfer")
public class TransferController
{
    @Autowired
    private ISysAreaInfoService sysAreaInfoService;
    
    @Autowired
    IFileUploadService fileUploadService;
    
    @Autowired
    IBillTransferService billTransfenService;
    
    @Autowired
    IBillNoGeneratorService billNoGeneratorService;
    
    @RequestMapping(value = "/editTransferBill.do")
    public String editTransferBill(Integer id,HttpServletRequest request, Model model)
    {
        SysUser user= ShiroUtils.getSysUser();
        String companyNo=user.getCompanyNo();
        
        //进货门店
        SysAreaInfoExample areaExample = new SysAreaInfoExample();
        areaExample.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(user.getAreaCode()+"%").andStatusEqualTo(1).andAreaTypeIn(Arrays.asList(new Integer[]{0,1,2}));
        List<BaseEntity> areaList = sysAreaInfoService.selectByExample(areaExample);
        model.addAttribute("areaList",areaList);
        
        if(id!=null)
        {
            BillTransfer billTransfer = (BillTransfer) billTransfenService.getBillWithItem(id);
            model.addAttribute("billTransfer",billTransfer);
            model.addAttribute("itemListData",JSONArray.toJSON(billTransfer.getItemList()).toString());
        }else
        {
            //自动创建一个新的
            BillTransfer billTransfer = new BillTransfer();
            billTransfer.setBillDate(JodaUtils.getShortDate());
            billTransfer.setSysBillNo(billNoGeneratorService.getNextBillNo(ShiroUtils.getCompanyNo(),Constance.BILL_TYPE_TRANSFER,ShiroUtils.getSysUser().getUserSheetNoPrefix()));
            billTransfer.setBillNo(billTransfer.getSysBillNo());
            model.addAttribute("billTransfer",billTransfer);
            model.addAttribute("itemListData","[]");
        }
        
        //获取各种状态的单据
        Map<String,Object> desktopMap = billTransfenService.getDesktopBill();
        model.addAttribute("desktopMap",desktopMap);
        
        return "bill/transfer/editTransferBill";
    }
    
    /**    
     * saveBillAudit(这里用一句话描述这个方法的作用)    
     * 保存成功       
     * @param @param billPurchase
     * @param @param request
     * @param @param response
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @ResponseBody
    @RequestMapping(value = "/addTransferItemBatch.do")
    public Ret addTransferItemBatch(BillTransfer billTransfer,@RequestParam String querySql ,HttpServletRequest request, HttpServletResponse response){
        SysUser user= ShiroUtils.getSysUser();
        try
        {
            billTransfer.setCompanyNo(ShiroUtils.getCompanyNo());
            BillTransfer newBillTransfer = billTransfenService.addTransferItemBatch(billTransfer,querySql);
            return Ret.ok("保存成功",newBillTransfer);
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
    
    @ResponseBody
    @RequestMapping(value = "/addItemByStockId.do")
    public Ret addItemByStockId(@RequestBody BillTransfer billTransfer,Integer stockId,HttpServletRequest request, HttpServletResponse response){
        try
        {
            BillTransfer newBillTransfer = billTransfenService.addByStockId(billTransfer,stockId);
            return Ret.ok("保存成功",newBillTransfer);
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
    
    @ResponseBody
    @RequestMapping(value = "/updateItemById.do")
    public Ret updateItemById(@RequestBody BillTransferItem billTransferItem,HttpServletRequest request, HttpServletResponse response){
        try
        {
            billTransfenService.updateItemById(billTransferItem);
            return Ret.ok("保存成功");
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
    
    /**    
     * saveBillAudit(这里用一句话描述这个方法的作用)    
     * 保存成功       
     * @param @param billPurchase
     * @param @param request
     * @param @param response
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @ResponseBody
    @RequestMapping(value = "/saveBillAudit.do")
    public Ret saveBillAudit(BillTransfer billTransfer,HttpServletRequest request, HttpServletResponse response){
        SysUser user= ShiroUtils.getSysUser();
        try
        {
            billTransfer.setCompanyNo(ShiroUtils.getCompanyNo());
            billTransfenService.saveBillAudit(billTransfer);
            return Ret.ok("保存成功");
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
    
    @ResponseBody
    @RequestMapping(value = "/deleteBill.do")
    public Ret deleteBill(Integer billId,HttpServletRequest request, HttpServletResponse response){
        SysUser user= ShiroUtils.getSysUser();
        try
        {
            billTransfenService.deleteBill(billId);
            return Ret.ok("删除成功成功");
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
    
    @ResponseBody
    @RequestMapping(value = "/deleteBillItem.do")
    public Ret deleteBillItem(Integer billId,Integer itemId,HttpServletRequest request, HttpServletResponse response){
        SysUser user= ShiroUtils.getSysUser();
        try
        {
            billTransfenService.deleteBillItem(billId,itemId);
            return Ret.ok("删除成功");
        } catch (Exception e)
        {
            e.printStackTrace();
            return Ret.error(e.getMessage());
        }
    }
}
