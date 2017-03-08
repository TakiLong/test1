package com.hcycom.pingtest.modle;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CirInfo {
	@JsonProperty("circuitNo")
    private String circuitNo;
	@JsonProperty("sourceNE")
    private String abDevice;
    
	@JsonProperty("sourceNE2")
    private String zbDevice;
	@JsonProperty("peIpStandard")
    private String peIpStandard;
	@JsonProperty("destIP")
    private String ceIpStandard;
	@JsonProperty("finalCustName")
    private String finalCustName;

    public String getFinalCustName() {
		return finalCustName;
	}
	public void setFinalCustName(String finalCustName) {
		this.finalCustName = finalCustName;
	}
	
	public String getCircuitNo() {
        return circuitNo;
    }
    public void setCircuitNo(String circuitNo) {
        this.circuitNo = circuitNo ;
    }
    
    public String getAbDevice() {
		return abDevice;
	}
	public void setAbDevice(String abDevice) {
		this.abDevice = abDevice;
	}
	
	public String getZbDevice() {
		return zbDevice;
	}
	public void setZbDevice(String zbDevice) {
		this.zbDevice = zbDevice;
	}
	public String getPeIpStandard() {
        return peIpStandard;
    }
    public void setPeIpStandard(String peIpStandard) {
        this.peIpStandard = peIpStandard ;
    }
    public String getCeIpStandard() {
        return ceIpStandard;
    }
    public void setCeIpStandard(String ceIpStandard) {
        this.ceIpStandard = ceIpStandard ;
    }
}