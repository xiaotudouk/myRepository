package com.example.mySpringBootDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mySpringBootDemo.entity.User;
import com.example.mySpringBootDemo.mapper.UserMapper;
import com.example.mySpringBootDemo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserByID(String id) {
		return userMapper.getUserByID(id);
	}

	@Override
	public List<String> getAllUserNames() {
		return userMapper.getAllUserName(); 
	}

}
