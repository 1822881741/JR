package com.jr.erp.base.freemarker;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;
public class FreeMarkerViewExtend extends FreeMarkerView {
	protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request){
		try {
			super.exposeHelpers(model, request);
		} catch (Exception e) {
			logger.error("FreeMarkerViewExtend 加载父类出现异常。请检查。", e);
		}
		model.put("basePath", request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/");//base目录。
		model.put("contextPath", request.getContextPath());//base目录。
	}
}
