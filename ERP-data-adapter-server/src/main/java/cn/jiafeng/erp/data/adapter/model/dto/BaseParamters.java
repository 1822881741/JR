package cn.jiafeng.erp.data.adapter.model.dto;

import java.util.List;

public class BaseParamters {
	private String companyNo;
	private List<Integer> ids;

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

}
