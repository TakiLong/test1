package com.hcycom.pingtest.service.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.hcycom.pingtest.dao.PingResultMapper;
import com.hcycom.pingtest.entity.PingResult;
import com.hcycom.pingtest.service.PingResultService;



@Service("pingResultService")
public class PingResultServiceImpl implements  PingResultService{
	
	@Resource(name="pingResultMapper")
	private PingResultMapper pingResultMapper;

	@Override
	public int insert(PingResult record) {
		// TODO Auto-generated method stub
		return pingResultMapper.insert(record);
	}

	@Override
	public List<PingResult> selectByTime(Map<String, String> map) {
		// TODO Auto-generated method stub
		return pingResultMapper.selectByTime(map);
	}

	@Override
	public List<PingResult> selectByType(String circuitType) {
		// TODO Auto-generated method stub
		return pingResultMapper.selectByType(circuitType);
	}

	@Override
	public List<PingResult> selectByCircuitNo(String circuitNo) {
		// TODO Auto-generated method stub
		return pingResultMapper.selectByCircuitNo(circuitNo);
	}

	@Override
	public List<PingResult> selectByNo(Integer taskId) {
		// TODO Auto-generated method stub
		return pingResultMapper.selectByNo(taskId);
	}

	



}
