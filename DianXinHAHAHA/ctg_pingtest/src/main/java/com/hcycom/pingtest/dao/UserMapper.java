package com.hcycom.pingtest.dao;

import java.util.List;

import com.hcycom.pingtest.entity.User;

public interface UserMapper {
	 User login(User u);
	 List<User> selectAllNo();
	 User selectByNo(String id);
}