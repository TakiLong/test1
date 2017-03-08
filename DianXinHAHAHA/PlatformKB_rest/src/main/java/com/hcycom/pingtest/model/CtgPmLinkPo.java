package com.hcycom.pingtest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CtgPmLinkPo {
	
	@JsonProperty("platform_id")
	private Integer platformId;
	@JsonProperty("link_name")
    private String linkName;
	@JsonProperty("a_device")
    private String aDevice;
	@JsonProperty("a_port")
    private String aPort;
	@JsonProperty("a_ip")
    private String aIp;
	@JsonProperty("z_device")
    private String zDevice;
	@JsonProperty("z_port")
    private String zPort;
	@JsonProperty("z_ip")
    private String zIp;
	@JsonProperty("route")
    private String route;
	@JsonProperty("remarks")
    private String remarks;
	@JsonProperty("name")
    private String name;
	@JsonProperty("name_en")
    private String nameEn;

	public Integer getPlatformId() {
		return platformId;
	}

	public void setPlatformId(Integer platformId) {
		this.platformId = platformId;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getaDevice() {
		return aDevice;
	}

	public void setaDevice(String aDevice) {
		this.aDevice = aDevice;
	}

	public String getaPort() {
		return aPort;
	}

	public void setaPort(String aPort) {
		this.aPort = aPort;
	}

	public String getaIp() {
		return aIp;
	}

	public void setaIp(String aIp) {
		this.aIp = aIp;
	}

	public String getzDevice() {
		return zDevice;
	}

	public void setzDevice(String zDevice) {
		this.zDevice = zDevice;
	}

	public String getzPort() {
		return zPort;
	}

	public void setzPort(String zPort) {
		this.zPort = zPort;
	}

	public String getzIp() {
		return zIp;
	}

	public void setzIp(String zIp) {
		this.zIp = zIp;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
