package com.hcycom.pingtest.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hcycom.pingtest.dao.UserMapper;
import com.hcycom.pingtest.entity.User;
import com.hcycom.pingtest.service.UserService;



@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource(name="userMapper")
	private UserMapper userMapper;

	@Override
	public User login(User u) {
		// TODO Auto-generated method stub
		return userMapper.login(u);
	}


	@Override
	public List<User> selectAllNo() {
		// TODO Auto-generated method stub
		return userMapper.selectAllNo();
	}

	@Override
	public User selectByNo(String id) {
		// TODO Auto-generated method stub
		return userMapper.selectByNo(id);
	}


}
