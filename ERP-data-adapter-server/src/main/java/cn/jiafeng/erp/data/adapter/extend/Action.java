package cn.jiafeng.erp.data.adapter.extend;

import cn.jiafeng.erp.data.adapter.extend.exception.ServiceException;

@FunctionalInterface
public interface Action {
	public abstract void run() throws ServiceException, Exception;
}