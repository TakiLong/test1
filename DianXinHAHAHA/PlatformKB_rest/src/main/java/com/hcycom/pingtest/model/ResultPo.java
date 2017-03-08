package com.hcycom.pingtest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultPo {

	@JsonProperty("errorcode")
	private String errorCode; //状态码
	private List<Object> data; //返回参数

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

}
