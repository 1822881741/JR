package com.jr.erp.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.BasePageForm;
import com.jr.erp.base.utils.RetPage;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysStoreExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;

/**     
 * 类名称：SysAreaInfoController    
 * 类描述：区域管理类    
 * 创建人：Administrator    
 * 创建时间：2018年9月7日 下午8:18:19    
 * 修改人：Administrator    
 * 修改时间：2018年9月7日 下午8:18:19    
 * 修改备注：    
 * @version  1.0    
 */
@Controller
@RequestMapping("/sysAreaInfo")
public class SysAreaInfoController {

	@Autowired
	ISysAreaInfoService sysAreaInfoService;
	
	/**    
	 * viewAreaInfo(这里用一句话描述这个方法的作用)    
	 * 调整到区域页面
	 * @param @param request
	 * @param @return     
	 * @return String
	 * @Exception 异常对象
	*/
	@RequestMapping(value="/viewAreaInfo.do")
	public String viewAreaInfo(HttpServletRequest request)
	{
		
		return "sys/viewAreaInfo";
	}
	
	/**    
	 * areaInfoList(这里用一句话描述这个方法的作用)    
	 * 获取区域数据       
	 * @param @param request
	 * @param @return     
	 * @return RetPage
	 * @Exception 异常对象
	*/
	@RequestMapping(value="/getAreaInfoList.do")
	@ResponseBody
	public RetPage areaInfoList(BasePageForm pageForm,HttpServletRequest request)
    {
        SysUser user = ShiroUtils.getSysUser();
        SysAreaInfoExample exampale = new SysAreaInfoExample();
        exampale.setPage(pageForm.getPage());
        exampale.setLimit(pageForm.getLimit());
        exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo());
        RetPage page = sysAreaInfoService.selectPage(exampale);
        return page;
    }
}
