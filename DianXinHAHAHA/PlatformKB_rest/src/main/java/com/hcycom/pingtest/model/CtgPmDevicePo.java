package com.hcycom.pingtest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CtgPmDevicePo {
	
	@JsonProperty("platform_id")
	private Integer platformId;
	@JsonProperty("name")
    private String name;
	@JsonProperty("name_en")
    private String nameEn;
	@JsonProperty("device_name")
	private String deviceName;
	@JsonProperty("device_ip")
    private String deviceIp;
	@JsonProperty("purpose")
    private String purpose;
	@JsonProperty("vender")
    private String vender;
	@JsonProperty("version")
    private String version;
	@JsonProperty("remarks")
    private String remarks;
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
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceIp() {
		return deviceIp;
	}
	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getVender() {
		return vender;
	}
	public void setVender(String vender) {
		this.vender = vender;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
