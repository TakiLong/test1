package com.hcycom.pingtest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HcyMnEquipMentPo {
	@JsonProperty("Device_id")
	private String deviceId;//设备ID
	@JsonProperty("Device_category")
	private int deviceCategory;//平台Id
	@JsonProperty("Device_name")
	private String deviceName;//设备名称
	@JsonProperty("Device_Vendor")
	private String deviceVendor;//设备供应商
	@JsonProperty("Device_model")
	private String deviceModel;//设备型号
	@JsonProperty("Device_ip")
	private String deviceIp;//设备IP
	@JsonProperty("Remote_protocol")
	private String remoteProtocol;//远程协议
	@JsonProperty("In_network_manage")
	private String inNetworkManage;//是否在网管管理范围内
	@JsonProperty("Ssh_username")
	private String sshUsername;//ssh登录用户名
	@JsonProperty("Ssh_password")
	private String sshPassword;//ssh登录密码
	@JsonProperty("Ssh_prompt")
	private String sshPrompt;//ssh命令提示符
	@JsonProperty("Telnet_username")
	private String telnetUsername;//Tenlent登录用户名
	@JsonProperty("Telnet_password")
	private String telnetPassword;//Tenlent登录密码
	@JsonProperty("Telnet_prompt")
	private String telnetPrompt;//Telnet命令提示符
	@JsonProperty("Telnet_username_prompt")
	private String telnetUsernamePrompt;//远程登录的用户名的提示
	@JsonProperty("Telnet_password_prompt")
	private String telnetPasswordPrompt;//远程登录的密码提示
	@JsonProperty("Ssh_port")
	private String sshPort;//ssh端口
	@JsonProperty("Ssh_timeout")
	private int sshTimeout;//ssh登录超时时间
	@JsonProperty("Telnet_port")
	private String telnetPort;//Telent端口
	@JsonProperty("Telnet_timeout")
	private int telnetTimeout;//Telent登录超时时间
	@JsonProperty("Remarks")
	private String remarks;//备注
	@JsonProperty("name")
    private String name;
	@JsonProperty("name_en")
    private String nameEn;
	
	
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public int getDeviceCategory() {
		return deviceCategory;
	}

	public void setDeviceCategory(int deviceCategory) {
		this.deviceCategory = deviceCategory;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceVendor() {
		return deviceVendor;
	}

	public void setDeviceVendor(String deviceVendor) {
		this.deviceVendor = deviceVendor;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

	public String getRemoteProtocol() {
		return remoteProtocol;
	}

	public void setRemoteProtocol(String remoteProtocol) {
		this.remoteProtocol = remoteProtocol;
	}

	public String getInNetworkManage() {
		return inNetworkManage;
	}

	public void setInNetworkManage(String inNetworkManage) {
		this.inNetworkManage = inNetworkManage;
	}

	public String getSshUsername() {
		return sshUsername;
	}

	public void setSshUsername(String sshUsername) {
		this.sshUsername = sshUsername;
	}

	public String getSshPassword() {
		return sshPassword;
	}

	public void setSshPassword(String sshPassword) {
		this.sshPassword = sshPassword;
	}

	public String getSshPrompt() {
		return sshPrompt;
	}

	public void setSshPrompt(String sshPrompt) {
		this.sshPrompt = sshPrompt;
	}

	public String getTelnetUsername() {
		return telnetUsername;
	}

	public void setTelnetUsername(String telnetUsername) {
		this.telnetUsername = telnetUsername;
	}

	public String getTelnetPassword() {
		return telnetPassword;
	}

	public void setTelnetPassword(String telnetPassword) {
		this.telnetPassword = telnetPassword;
	}

	public String getTelnetPrompt() {
		return telnetPrompt;
	}

	public void setTelnetPrompt(String telnetPrompt) {
		this.telnetPrompt = telnetPrompt;
	}

	public String getTelnetUsernamePrompt() {
		return telnetUsernamePrompt;
	}

	public void setTelnetUsernamePrompt(String telnetUsernamePrompt) {
		this.telnetUsernamePrompt = telnetUsernamePrompt;
	}

	public String getTelnetPasswordPrompt() {
		return telnetPasswordPrompt;
	}

	public void setTelnetPasswordPrompt(String telnetPasswordPrompt) {
		this.telnetPasswordPrompt = telnetPasswordPrompt;
	}

	public String getSshPort() {
		return sshPort;
	}

	public void setSshPort(String sshPort) {
		this.sshPort = sshPort;
	}

	public int getSshTimeout() {
		return sshTimeout;
	}

	public void setSshTimeout(int sshTimeout) {
		this.sshTimeout = sshTimeout;
	}

	public String getTelnetPort() {
		return telnetPort;
	}

	public void setTelnetPort(String telnetPort) {
		this.telnetPort = telnetPort;
	}

	public int getTelnetTimeout() {
		return telnetTimeout;
	}

	public void setTelnetTimeout(int telnetTimeout) {
		this.telnetTimeout = telnetTimeout;
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
