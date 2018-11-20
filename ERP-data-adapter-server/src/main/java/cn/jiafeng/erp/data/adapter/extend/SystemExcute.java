package cn.jiafeng.erp.data.adapter.extend;

import java.util.concurrent.Callable;

import cn.jiafeng.erp.data.adapter.extend.exception.ServiceException;

public class SystemExcute {

	public static void ExcuteServiceException(Action func) throws ServiceException, Exception {
		func.run();
	}

	public static <T> T ExcuteServiceException(Callable<T> func) throws ServiceException, Exception {
		return func.call();
	}
}
