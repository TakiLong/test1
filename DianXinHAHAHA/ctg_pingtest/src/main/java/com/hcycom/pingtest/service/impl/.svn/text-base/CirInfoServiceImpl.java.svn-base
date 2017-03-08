package com.hcycom.pingtest.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hcycom.pingtest.dao.CirInfoMapper;
import com.hcycom.pingtest.entity.CirInfo;
import com.hcycom.pingtest.service.CirInfoService;



@Service("cirInfoService")
public class CirInfoServiceImpl implements  CirInfoService{
	
	@Resource(name="cirInfoMapper")
	private CirInfoMapper cirInfoMapper;

	@Override
	public List<CirInfo> selectAll() {
		// TODO Auto-generated method stub
		return cirInfoMapper.selectAll();
	}


	@Override
	public List<CirInfo> selectAllNo() {
		// TODO Auto-generated method stub
		return cirInfoMapper.selectAllNo();
	}

	@Override
	public CirInfo selectByNo(String circuitNo) {
		// TODO Auto-generated method stub
		return cirInfoMapper.selectByNo(circuitNo);
	}




}
