package com.hcycom.pingtest.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.hcycom.pingtest.base.BaseDao;
import com.hcycom.pingtest.dao.CirInfoMapper;
import com.hcycom.pingtest.dao.UserMapper;
import com.hcycom.pingtest.entity.CirInfo;
import com.hcycom.pingtest.entity.User;



@Repository("userMapper")
public class UserMapperImpl extends BaseDao  implements UserMapper {

	@Override
	public User selectByNo(String id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.hcycom.pingtest.dao.UserMapper.selectByNo",id);
	}                                                                         


	@Override
	public User login(User u){
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.hcycom.pingtest.dao.UserMapper.login",u);
	}
	
	@Override
	public List<User> selectAllNo(){
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.UserMapper.selectAllNo");
	}

}