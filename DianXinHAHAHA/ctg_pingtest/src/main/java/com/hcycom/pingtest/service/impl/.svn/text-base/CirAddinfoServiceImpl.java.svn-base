package com.hcycom.pingtest.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hcycom.pingtest.dao.CirAddinfoMapper;
import com.hcycom.pingtest.entity.CirAddinfo;
import com.hcycom.pingtest.service.CirAddinfoService;



@Service("cirAddinfoService")
public class CirAddinfoServiceImpl implements  CirAddinfoService{
	
	@Resource(name="cirAddinfoMapper")
	private CirAddinfoMapper cirAddinfoMapper;

	@Override
	public List<CirAddinfo> selectAll() {
		// TODO Auto-generated method stub
		return cirAddinfoMapper.selectAll();
	}


	@Override
	public List<CirAddinfo> selectAllNo() {
		// TODO Auto-generated method stub
		return cirAddinfoMapper.selectAllNo();
	}

	@Override
	public CirAddinfo selectByNo(String circuitNo) {
		// TODO Auto-generated method stub
		return cirAddinfoMapper.selectByNo(circuitNo);
	}




}
