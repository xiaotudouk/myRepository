package com.example.mySpringBootDemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.mySpringBootDemo.entity.User;

@Mapper
public interface UserMapper {

	/**
	 * 根据用户id查询一个用户详情
	 */
	@Select("select id,name,age from rsy_user where id=#{id}")
	User getUserByID(String id);
	
	/**
	 * 查询所有用户姓名
	 */
	@Select("select name from rsy_user")
	List<String> getAllUserName();
}
