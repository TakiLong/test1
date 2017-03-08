package com.hcycom.pingtest.modle;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PingTask {
	@JsonProperty("taskId")
    private Integer id;
	@JsonProperty("taskName")
    private String taskName;
	@JsonProperty("circuitType")
    private String circuitType;
	@JsonProperty("circuitNo")
    private String circuitNo;
	@JsonProperty("custName")
    private String custName;
	@JsonProperty("sourceNE")
    private String sourceNe;
	@JsonProperty("vpnCode")
    private String vpnCode;
	@JsonProperty("sourceIP")
    private String sourceIp;
	@JsonProperty("destIP")
    private String destIp;
	@JsonProperty("pingCommand")
    private String pingCmd;
	@JsonProperty("period")
    private Integer period;
	@JsonProperty("duration")
    private Integer duration;
	@JsonProperty("startTime")
    private Date startTime;
	@JsonProperty("endTime")
    private Date endTime;
	@JsonProperty("createTime")
    private Date createTime;
	@JsonProperty("taskStatus")
    private Integer status;
	@JsonProperty("lastExecTime")
    private Date lastExecTime;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getCircuitType() {
        return circuitType;
    }
    public void setCircuitType(String circuitType) {
        this.circuitType = circuitType;
    }

    public String getCircuitNo() {
        return circuitNo;
    }
    public void setCircuitNo(String circuitNo) {
        this.circuitNo = circuitNo;
    }

    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getSourceNe() {
        return sourceNe;
    }
    public void setSourceNe(String sourceNe) {
        this.sourceNe = sourceNe;
    }

    public String getVpnCode() {
        return vpnCode;
    }
    public void setVpnCode(String vpnCode) {
        this.vpnCode = vpnCode;
    }

    public String getSourceIp() {
        return sourceIp;
    }
    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getDestIp() {
        return destIp;
    }
    public void setDestIp(String destIp) {
        this.destIp = destIp;
    }

    public String getPingCmd() {
        return pingCmd;
    }
    public void setPingCmd(String pingCmd) {
        this.pingCmd = pingCmd;
    }

    public Integer getPeriod() {
        return period;
    }
    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastExecTime() {
        return lastExecTime;
    }
    public void setLastExecTime(Date lastExecTime) {
        this.lastExecTime = lastExecTime;
    }
}