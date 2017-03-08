
package com.hcycom.pingtest.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.hcycom.pingtest.base.BaseDao;
import com.hcycom.pingtest.dao.CirAddinfoMapper;
import com.hcycom.pingtest.entity.CirAddinfo;



@Repository("cirAddinfoMapper")
public class CirAddinfoMapperImpl extends BaseDao  implements CirAddinfoMapper {

	@Override
	public CirAddinfo selectByNo(String circuitNo) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.hcycom.pingtest.dao.CirAddinfoMapper.selectByNo",circuitNo);
	}                                                                         


	@Override
	public List<CirAddinfo> selectAll(){
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.CirAddinfoMapper.selectAll");
	}
	
	@Override
	public List<CirAddinfo> selectAllNo(){
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.CirAddinfoMapper.selectAllNo");
	}

}

