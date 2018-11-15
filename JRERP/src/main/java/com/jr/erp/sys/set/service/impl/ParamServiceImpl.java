package com.jr.erp.sys.set.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.sys.set.entity.Param;
import com.jr.erp.sys.set.entity.ParamExample;
import com.jr.erp.sys.set.service.IParamService;

/**     
 * 类名称：ParamServiceImpl    
 * 类描述： 参数设置   
 * 创建人：admin    
 * 创建时间：2018年11月13日 下午6:22:47    
 * 修改人：admin    
 * 修改时间：2018年11月13日 下午6:22:47    
 * 修改备注：    
 * @version  1.0    
 */
@Service(value = "paramService")
public class ParamServiceImpl extends AbstractBaseService<Param> implements IParamService
{

    @Override
    public void updateBillFlowParam(String companyNo, String areaCode, String module, Map<String, Object> paramMap)
    {
        if (paramMap != null)
        {
            switch (module)
            {
            case "purchase":
                Param param = new Param();
                param.setAreaCode(areaCode);
                param.setCompanyNo(companyNo);
                param.setModule(module);
                param.setMustSet(1);
                param.setParamName("isAudit");
                param.setParamValue(paramMap.get("isAudit").toString());
                param.setRemarks("是否需要审核");
                this.insert(param);

                Param param2 = new Param();
                param2.setAreaCode(areaCode);
                param2.setCompanyNo(companyNo);
                param2.setModule(module);
                param2.setMustSet(1);
                param2.setParamName("isAransit");
                param2.setParamValue(paramMap.get("isAransit").toString());
                param2.setRemarks("进货是否开启在途");
                this.insert(param2);
                break;
            default:
                break;
            }
        }
    }

    @Override
    public Param getParam(String companyNo, String areaCode, String module, String paramName)
    {
        ParamExample example = new ParamExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeEqualTo(areaCode).andModuleEqualTo(module).andParamNameEqualTo(paramName);
        return CollectionUtils.isEmpty(this.selectByExample(example))?null:(Param)this.selectByExample(example).get(0);
    }
}