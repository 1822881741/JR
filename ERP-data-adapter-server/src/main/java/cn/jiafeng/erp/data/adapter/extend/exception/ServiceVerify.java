package cn.jiafeng.erp.data.adapter.extend.exception;

public class ServiceVerify {
	public ServiceVerify() {

	}

	public static void Verify(Boolean iserror, String message) throws ServiceErrorException {
		if (iserror)
			throw ServiceErrorException.Default(message);
	}
}
