package com.example.mySpringBootDemo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mySpringBootDemo.entity.User;
import com.example.mySpringBootDemo.service.UserService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;

@RestController
@RequestMapping(value="/user") 
public class UserController {
	
	@Autowired
	private UserService userService;
	

	@ApiOperation(value="获取用户姓名", notes="根据url的id来获取用户详细信息")//增加说明
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")//参数说明
	@RequestMapping(value="/getUserName/{id}", method=RequestMethod.GET)
	public String getUserName(@PathVariable String id){//@PathVariable获取url中的传入的参数
		//业务逻辑
		return "张三";
	}
	
	@ApiOperation(value="获取用户年龄", notes="根据url的id来获取用户详细信息")//增加说明
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")//参数说明
	@RequestMapping(value="/getUserAge/{id}", method=RequestMethod.GET)
	public Integer getUserAge(@PathVariable String id){
		
		return 17;
	}
	
	
	@ApiOperation(value="获取用户姓名列表", notes="查询所有用户的姓名")
    @RequestMapping(value="/getUserNameList", method=RequestMethod.GET)
	public List<String> getUserNameList(){
		List<String> userNames = new ArrayList<String>(); 
		/*userNames.add("李四");
		userNames.add("王五");
		userNames.add("赵六");
	*/
		userNames = userService.getAllUserNames();
		return userNames;
	}
	
	@ApiOperation(value="获取某个用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
    @RequestMapping(value="/getUserByID/{id}", method=RequestMethod.GET)
	public User getUserByID(@PathVariable String id){
		/*User user = new User();
		user.setId("1");
		user.setName("钱七");
		user.setAge(18);*/
		User user = userService.getUserByID(id);
		
		return user;
	}
	
	@ApiOperation(value="获取用户信息", notes="查询所有用户的信息")
    @RequestMapping(value="/getUsers", method=RequestMethod.GET)
	public JSONObject getUsers(){
		JSONObject jsonObject = new JSONObject();
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "张三");
		map.put("2", "李四");
		map.put("3", "王五");
		
		jsonObject.putAll(map);
		return jsonObject;
	} 
	
}
