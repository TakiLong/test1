package com.hcycom.pingtest.dao.impl;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hcycom.pingtest.base.BaseDao;
import com.hcycom.pingtest.dao.PingResultMapper;
import com.hcycom.pingtest.entity.PingResult;



@Repository("pingResultMapper")
public class PingResultMapperImpl extends BaseDao  implements PingResultMapper {


	@Override
	public int insert(PingResult record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hcycom.pingtest.dao.PingResultMapper.insert",record);
	}

	@Override
	public List<PingResult> selectByTime(Map<String, String> map) {
		// TODO Auto-generated method stub

		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.PingResultMapper.selectByTime",map);
	}

	@Override
	public List<PingResult> selectByType(String circuitType) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.PingResultMapper.selectByType",circuitType);
	}

	@Override
	public List<PingResult> selectByCircuitNo(String circuitNo) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.PingResultMapper.selectByCircuitNo",circuitNo);
	}

	@Override
	public List<PingResult> selectByNo(Integer taskId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.PingResultMapper.selectByNo",taskId);
	}                                                                         


	
}