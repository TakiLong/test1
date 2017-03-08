package com.hcycom.pingtest.service;

import java.util.List;

import com.hcycom.pingtest.entity.User;

public interface UserService {

    User login(User u);
    List<User> selectAllNo();
    User selectByNo(String id);
	
}
