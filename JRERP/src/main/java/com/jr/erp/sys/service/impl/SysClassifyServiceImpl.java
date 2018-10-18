package com.jr.erp.sys.service.impl;

import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.sys.entity.SysClassify;
import com.jr.erp.sys.service.ISysClassifyService;

/**     
 * 类名称：SysClassifyServiceImpl    
 * 类描述：商品分类设置    
 * 创建人：Administrator    
 * 创建时间：2018年10月18日 上午11:53:40    
 * 修改人：Administrator    
 * 修改时间：2018年10月18日 上午11:53:40    
 * 修改备注：    
 * @version  1.0    
 */
@Service(value = "sysClassifyService")
public class SysClassifyServiceImpl extends AbstractBaseService<SysClassify> implements ISysClassifyService
{
    @Override
    public void saveClassify(SysClassify sysClassify)
    {
        sysClassify.setIsSysDef(0);
        this.merge(sysClassify);
    }
}
