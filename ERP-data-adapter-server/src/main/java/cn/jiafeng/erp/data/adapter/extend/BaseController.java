package cn.jiafeng.erp.data.adapter.extend;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import cn.jiafeng.erp.data.adapter.extend.exception.ServiceException;

public class BaseController {

	public static String PROCESSSUCESSCODE = "success";
	public static String PROCESSERRORCODE = "error";

	protected static Logger logger = LoggerFactory.getLogger(BaseController.class);

	protected HttpServletRequest getHttpServletRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}

	protected HttpServletResponse getHttpServletResponse() {
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
	}

	protected HashMap<String, Object> getGeneralMap() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		HttpServletRequest request = getHttpServletRequest();
		Map<String, String[]> patameters = request.getParameterMap();
		for (String key : patameters.keySet()) {
			map.put(key, request.getParameter(key));
		}
		return map;
	}

	protected String Action(Action func) {
		try {
			SystemExcute.ExcuteServiceException(func);
			return respHandresult(new HandleResult(PROCESSSUCESSCODE, "处理成功"));
		} catch (ServiceException se) {
			logger.info(se.getMessage());
			if (se.getCodeMsgList() != null && se.getCodeMsgList().size() > 0)
				return respHandresult(new HandleResult(PROCESSERRORCODE, se.getCodeMsgList()));
			return respHandresult(new HandleResult<String>(se.getCode(), se.getMessage()));
		} catch (SQLException se) {
			logger.error(se.getMessage());
			return respHandresult(new HandleResult(PROCESSERRORCODE, "数据脚本错误"));
		} catch (Exception se) {
			logger.error(se.getMessage());
			return respHandresult(new HandleResult(PROCESSERRORCODE, se.getMessage()));
		}
	}

	protected <T> String Func(Callable<T> func) {
		try {
			T temp = SystemExcute.ExcuteServiceException(func);
			return respHandresult(new HandleResult<T>(PROCESSSUCESSCODE, temp));
		} catch (ServiceException se) {
			logger.info(se.getMessage());
			if (se.getCodeMsgList() != null && se.getCodeMsgList().size() > 0)
				return respHandresult(new HandleResult(PROCESSERRORCODE, se.getCodeMsgList()));
			return respHandresult(new HandleResult<String>(se.getCode(), se.getMessage(), se.getMessage()));
		} catch (SQLException se) {
			logger.error(se.getMessage());
			return respHandresult(new HandleResult(PROCESSERRORCODE, "数据脚本错误"));
		} catch (Exception se) {
			logger.error(se.getMessage());
			se.printStackTrace();
			return respHandresult(new HandleResult(PROCESSERRORCODE, null, se.getMessage()));
		}
	}

	public static String respHandresult(HandleResult hr) {
		return JSONObject.toJSONString(hr, SerializerFeature.WriteMapNullValue);
	}
}
