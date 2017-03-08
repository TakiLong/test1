package com.hcycom.pingtest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HcyMnLinkInfoPo {
	@JsonProperty("Link_id")
	private String linkId;//链路ID
	@JsonProperty("Link_category")
	private int linkCategory;//平台ID
	@JsonProperty("Link_name")
	private String linkName;//链路名称
	@JsonProperty("Device_A_id")
	private String deviceAId;//A端设备Id
	@JsonProperty("Device_A_name")
	private String deviceAName;//A端设备名称
	@JsonProperty("Device_A_port")
	private String deviceAPort;//A端设备端口
	@JsonProperty("Device_A_ip")
	private String deviceAIp;//A端设备Ip
	@JsonProperty("Device_Z_id")
	private String deviceZId;//Z端设备ID
	@JsonProperty("Device_Z_name")
	private String deviceZName;//Z端设备名称
	@JsonProperty("Device_Z_port")
	private String deviceZPort;//Z端设备端口
	@JsonProperty("Device_Z_ip")
	private String deviceZIp;//Z端设备IP
	@JsonProperty("Transmission_no")
	private String transmissionNo;//传输编号
	@JsonProperty("Patch_cords")
	private String patchCords;//跳线信息
	@JsonProperty("In_test")
	private String inTest;//是否测试1：是；0：否
	@JsonProperty("Command_template")
	private String commandTemplate;//测试命令模板
	@JsonProperty("Remarks")
	private String remarks;//备注
	@JsonProperty("name")
	private String name;
	@JsonProperty("name_en")
	private String nameEn;

	public String getLinkId() {
		return linkId;
	}

	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}

	public int getLinkCategory() {
		return linkCategory;
	}

	public void setLinkCategory(int linkCategory) {
		this.linkCategory = linkCategory;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getDeviceAId() {
		return deviceAId;
	}

	public void setDeviceAId(String deviceAId) {
		this.deviceAId = deviceAId;
	}

	public String getDeviceAName() {
		return deviceAName;
	}

	public void setDeviceAName(String deviceAName) {
		this.deviceAName = deviceAName;
	}

	public String getDeviceAPort() {
		return deviceAPort;
	}

	public void setDeviceAPort(String deviceAPort) {
		this.deviceAPort = deviceAPort;
	}

	public String getDeviceAIp() {
		return deviceAIp;
	}

	public void setDeviceAIp(String deviceAIp) {
		this.deviceAIp = deviceAIp;
	}

	public String getDeviceZId() {
		return deviceZId;
	}

	public void setDeviceZId(String deviceZId) {
		this.deviceZId = deviceZId;
	}

	public String getDeviceZName() {
		return deviceZName;
	}

	public void setDeviceZName(String deviceZName) {
		this.deviceZName = deviceZName;
	}

	public String getDeviceZPort() {
		return deviceZPort;
	}

	public void setDeviceZPort(String deviceZPort) {
		this.deviceZPort = deviceZPort;
	}

	public String getDeviceZIp() {
		return deviceZIp;
	}

	public void setDeviceZIp(String deviceZIp) {
		this.deviceZIp = deviceZIp;
	}

	public String getTransmissionNo() {
		return transmissionNo;
	}

	public void setTransmissionNo(String transmissionNo) {
		this.transmissionNo = transmissionNo;
	}

	public String getPatchCords() {
		return patchCords;
	}

	public void setPatchCords(String patchCords) {
		this.patchCords = patchCords;
	}

	public String getInTest() {
		return inTest;
	}

	public void setInTest(String inTest) {
		this.inTest = inTest;
	}

	public String getCommandTemplate() {
		return commandTemplate;
	}

	public void setCommandTemplate(String commandTemplate) {
		this.commandTemplate = commandTemplate;
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
