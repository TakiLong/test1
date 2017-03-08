package com.hcycom.pingtest.entity;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")

public class Result implements Serializable{
	@JsonProperty("reason")
	private String reason;
	@JsonProperty("resultcode")
	private String resultcode;
	@JsonProperty("rows")
	private List<Object> rows;
	@JsonProperty("total")
	private int total;
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		if(reason==null){
			reason="";
		}
		this.reason = reason;
	}
	public String getResultcode() {
		return resultcode;
	}
	public void setResultcode(String resultcode) {
		if(resultcode==null){
			resultcode="";
		}
		this.resultcode = resultcode;
	}
	public List<Object> getRows() {
		return rows;
	}
	public void setRows(List<Object> rows) {
		
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}