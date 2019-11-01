package com.emotte.springboot_test.controller;

import com.emotte.springboot_test.entity.User;
import com.emotte.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getAll")
	public Object getAllList() throws Exception{
		List<User> ulist = userService.getAll();
		System.out.println("ulist="+ulist);
		return ulist;
	}
	
	/**
	 * 这个{id}是restful 风格的请求
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/user/{id}")
	public Object getUserById(@PathVariable("id") Long uid) throws Exception{
		System.out.println("uid"+uid);
		User u = userService.getUserById(uid);
		System.out.println("user="+u);
		return u == null ?"没有这个用户":u;
	}
	
	@RequestMapping("/save")
	public String saveUser() throws Exception{
		Map<String, Object> map = new HashMap<>();
		map.put("username", "userName"+UUID.randomUUID().toString().replaceAll("-", ""));
		map.put("nickName", "nick"+UUID.randomUUID().toString().replaceAll("-", ""));
		map.put("sex", new Random().nextInt(10) %2 == 1 ? "man":"woman");
		System.out.println("map="+map);
		int rest = userService.save(map);
		return rest == 1?"成功"+map:"失败";
	}
	
	@RequestMapping("/update")
	public String updateUser() throws Exception{
		Map<String, Object> map = new HashMap<>();
		map.put("username", "userName"+UUID.randomUUID().toString().replaceAll("-", ""));
		map.put("nickName", "nick"+UUID.randomUUID().toString().replaceAll("-", ""));
		map.put("id", new Random().nextInt(5));
		System.out.println("map="+map);
		int rest = userService.update(map);
		return rest == 1?"成功"+map:"失败";
	}
	
	@RequestMapping("/del/{id}")
	public String delUser (@PathVariable("id") Long id) throws Exception{
		int rest = userService.delete(id);
		return rest == 1?"成功":"失败";
	}
}
