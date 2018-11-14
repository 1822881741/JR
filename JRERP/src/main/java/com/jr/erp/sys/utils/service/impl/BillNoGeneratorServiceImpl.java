package com.jr.erp.sys.utils.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.utils.JodaUtils;
import com.jr.erp.bill.purchase.dao.BillPurchaseMapper;
import com.jr.erp.sys.utils.service.IBillNoGeneratorService;

/**     
 * 类名称：BillNoGeneratorServiceImpl    
 * 类描述：  单号生成器  
 * 创建人：admin    
 * 创建时间：2018年11月14日 下午4:13:44    
 * 修改人：admin    
 * 修改时间：2018年11月14日 下午4:13:44    
 * 修改备注：    
 * @version  1.0    
 */
@Service(value = "billNoGeneratorService")
public class BillNoGeneratorServiceImpl implements IBillNoGeneratorService
{

    @Autowired
    BillPurchaseMapper billPurchaseMapper;
    
    @Override
    public String getNextBillNo(String companyNo, Integer billType, String userPrefix)
    {
        String maxBillNo = null;
        String prefix = null;
        switch (billType)
        {
        case 1:
            prefix = "J" + userPrefix + JodaUtils.getBillNoDate();
            maxBillNo = billPurchaseMapper.selectMaxBillNo(companyNo, prefix);
            break;
        default:
            break;
        }
        if (StringUtils.isEmpty(maxBillNo))
        {
            return prefix + "001";
        }
        String sheetSeq = getNextSheetNo(maxBillNo.substring(prefix.length()));
        return prefix + sheetSeq;
    }
    /**    
     * 根据单号中最后三位的序列编号+1，返回三位编号
     * getNextSheetNo 
     * @param @param seq
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    private String getNextSheetNo(String seq)
    {
        if (StringUtils.isEmpty(seq))
        {
            return "001";
        }

        int _num = Integer.parseInt(seq);
        _num++;
        if (_num < 10)
        {
            return "00" + _num;
        } else if (_num < 100)
        {
            return "0" + _num;
        } else
        {
            return "" + _num;
        }
    }
}
