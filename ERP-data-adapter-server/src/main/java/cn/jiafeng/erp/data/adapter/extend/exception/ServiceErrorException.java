package cn.jiafeng.erp.data.adapter.extend.exception;

public class ServiceErrorException extends ServiceException {

	public ServiceErrorException() {
		super();
	}

	public ServiceErrorException(String message) {
		this.message = message;
		this.code = "error";
	}

	public static ServiceErrorException Default(String message) {
		return new ServiceErrorException(message);
	}

}
