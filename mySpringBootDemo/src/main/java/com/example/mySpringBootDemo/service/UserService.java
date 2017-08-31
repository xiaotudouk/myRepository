package com.example.mySpringBootDemo.service;

import java.util.List;

import com.example.mySpringBootDemo.entity.User;

public interface UserService {
	
	/**
	 * 根据用户id查询某个用户的详情
	 * @param id
	 * @return
	 */
	User getUserByID(String id);
	
	/**
	 * 查询所有用户的姓名
	 * @return
	 */
	List<String> getAllUserNames();
}
