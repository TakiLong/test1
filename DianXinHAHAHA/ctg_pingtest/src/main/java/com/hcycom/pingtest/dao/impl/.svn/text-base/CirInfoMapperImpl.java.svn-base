package com.hcycom.pingtest.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.hcycom.pingtest.base.BaseDao;
import com.hcycom.pingtest.dao.CirInfoMapper;
import com.hcycom.pingtest.entity.CirInfo;



@Repository("cirInfoMapper")
public class CirInfoMapperImpl extends BaseDao  implements CirInfoMapper {

	@Override
	public CirInfo selectByNo(String circuitNo) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.hcycom.pingtest.dao.CirInfoMapper.selectByNo",circuitNo);
	}                                                                         


	@Override
	public List<CirInfo> selectAll(){
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.CirInfoMapper.selectAll");
	}
	
	@Override
	public List<CirInfo> selectAllNo(){
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.CirInfoMapper.selectAllNo");
	}

}