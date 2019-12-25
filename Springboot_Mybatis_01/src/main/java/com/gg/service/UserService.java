package com.gg.service;

import com.gg.bean.User;
import com.gg.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
	@Autowired
    UserMapper userMapper;
	
    public User getUser(int id) {
    	return userMapper.getUser(id);
    }
}
