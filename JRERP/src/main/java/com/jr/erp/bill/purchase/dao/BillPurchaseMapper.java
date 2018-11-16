package com.jr.erp.bill.purchase.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jr.erp.base.mybatis.BaseMapper;
import com.jr.erp.bill.purchase.entity.BillPurchase;

public interface BillPurchaseMapper extends BaseMapper<BillPurchase> {

    @Select({"select billNo from bill_purchase where companyNo=#{companyNo} and sysBillNo like CONCAT(#{prefix},'%') order by sysBillNo desc limit 0,1"})
    String selectMaxBillNo(@Param("companyNo") String companyNo,@Param("prefix") String prefix);
}