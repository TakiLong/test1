package com.hcycom.pingtest.service;

import java.util.List;
import java.util.Map;

import com.hcycom.pingtest.entity.PingResult;



public interface PingResultService {
	int insert(PingResult record);
    List<PingResult> selectByTime(Map<String, String> map);
    List<PingResult> selectByType(String circuitType);
    List<PingResult> selectByCircuitNo(String circuitNo);
    List<PingResult> selectByNo(Integer taskId);
	
}
