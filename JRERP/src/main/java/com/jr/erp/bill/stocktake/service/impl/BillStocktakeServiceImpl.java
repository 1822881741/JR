package com.jr.erp.bill.stocktake.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.JodaUtils;
import com.jr.erp.base.utils.NumberUtils;
import com.jr.erp.bill.stocktake.entity.BillStocktake;
import com.jr.erp.bill.stocktake.entity.BillStocktakeExample;
import com.jr.erp.bill.stocktake.service.IBillStocktakeService;
import com.jr.erp.bill.stocktake.service.IBillStocktakeStockService;
import com.jr.erp.bill.utils.Constance;
import com.jr.erp.sys.entity.SysUser;

@Service(value="billStocktakeService")
public class BillStocktakeServiceImpl extends AbstractBaseService<BillStocktake> implements IBillStocktakeService
{
    @Autowired
    IBillStocktakeStockService billStocktakeStockService;
    
    @Override
    public List<BillStocktake> getBillStocktakeList(Integer status)
    {
        BillStocktakeExample example = new BillStocktakeExample();
        example.createCriteria().andCompanyNoEqualTo(ShiroUtils.getCompanyNo()).andAreaCodeLike(ShiroUtils.getUserAreaCode()+"%").andBillStatusEqualTo(status);
        example.setOrderByClause(" billDate desc");
        return (List)this.selectByExample(example);
    }
    
    @Override
    public void saveStocktakeMajor(BillStocktake billStocktake)
    {
        SysUser user = ShiroUtils.getSysUser();
        billStocktake.setCompanyNo(user.getCompanyNo());
        billStocktake.setCreateUserId(user.getId());
        billStocktake.setCreateUserName(user.getRealName());
        billStocktake.setCanViewAll(NumberUtils.toInt(billStocktake.getCanViewAll()));
        billStocktake.setBillDate(JodaUtils.getFullDate());
        billStocktake.setBillStatus(Constance.BILL_STATUS_NEW);
        this.insert(billStocktake);
        
        //copy库存
        int count = billStocktakeStockService.copyStock(billStocktake);
        
        billStocktake.setBookNum(count);
        this.updateByPrimaryKeySelective(billStocktake);
    }

    @Override
    public void deleteStocktakeMajor(Integer id)
    {
        billStocktakeStockService.deleteByMajorId(id);
        this.deleteByPrimaryKey(id);
    }

    @Override
    public List<BillStocktake> getCanTakeMajor()
    {
        BillStocktakeExample example = new BillStocktakeExample();
        example.createCriteria().andCompanyNoEqualTo(ShiroUtils.getCompanyNo()).andAreaCodeLike(ShiroUtils.getUserAreaCode()+"%").andBillStatusEqualTo(Constance.BILL_STATUS_NEW)
        .andAssignTakerIsNull();
        
        BillStocktakeExample.Criteria orCriteria = example.createCriteria();
        example.or().andCompanyNoEqualTo(ShiroUtils.getCompanyNo()).andAreaCodeLike(ShiroUtils.getUserAreaCode()+"%").andBillStatusEqualTo(Constance.BILL_STATUS_NEW).andAssignTakerNameLike("%"+ShiroUtils.getUserId().toString()+"%");
        
        return (List) this.selectByExample(example);
    }
}