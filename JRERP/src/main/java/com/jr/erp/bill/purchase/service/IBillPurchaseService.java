package com.jr.erp.bill.purchase.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.mybatis.IBaseService;
import com.jr.erp.bill.purchase.entity.BillPurchase;

public interface IBillPurchaseService extends IBaseService<BaseEntity>
{

    /**    
     * parseImportExcel(这里用一句话描述这个方法的作用)    
     * TODO(这里描述这个方法适用条件 – 可选)     
     * TODO(这里描述这个方法的注意事项 – 可选)       
     * @param @param companyNo
     * @param @param sechemeId
     * @param @param file
     * @param @return     
     * @return List<JSONObject>
     * @Exception 异常对象
    */
    List<JSONObject> parseImportExcel(String companyNo, Integer sechemeId, MultipartFile file);

    /**    
     * saveImportBill(这里用一句话描述这个方法的作用)    
     * 保存批量导入单据       
     * @param @param companyNo
     * @param @param billPurchase     
     * @return void
     * @Exception 异常对象
    */
    BillPurchase saveImportBill(BillPurchase billPurchase);

    /**    
     * saveBillAudit(这里用一句话描述这个方法的作用)    
     * 保存单据，产生库存       
     * @param @param billPurchase     
     * @return void
     * @Exception 异常对象
    */
    void saveBillAudit(BillPurchase billPurchase);
}
