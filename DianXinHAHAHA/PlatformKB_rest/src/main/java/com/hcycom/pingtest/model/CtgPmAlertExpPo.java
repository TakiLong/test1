package com.hcycom.pingtest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CtgPmAlertExpPo {

	@JsonProperty("fault_type")
    private String faultType;
	@JsonProperty("fault_name")
    private String faultName;
	@JsonProperty("cause")
    private String cause;
	@JsonProperty("suggest")
    private String suggest;
	@JsonProperty("influence")
    private String influence;
	@JsonProperty("remarks")
    private String remarks;
	@JsonProperty("platform_id")
	private Integer platformId;
	@JsonProperty("name")
    private String name;
	@JsonProperty("name_en")
    private String nameEn;

	public String getFaultType() {
		return faultType;
	}
	public void setFaultType(String faultType) {
		this.faultType = faultType;
	}
	public String getFaultName() {
		return faultName;
	}
	public void setFaultName(String faultName) {
		this.faultName = faultName;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getSuggest() {
		return suggest;
	}
	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
	public String getInfluence() {
		return influence;
	}
	public void setInfluence(String influence) {
		this.influence = influence;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public Integer getPlatformId() {
		return platformId;
	}
	public void setPlatformId(Integer platformId) {
		this.platformId = platformId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameEn() {
		return nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

}
