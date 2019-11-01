package com.emotte.springboot_test.redis;

import com.alibaba.fastjson.JSONObject;
import com.emotte.springboot_test.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void test() {

		// 保存字符串
		redisTemplate.opsForValue().set("url", "www.lrshuai.top");
		Assert.assertEquals("www.lrshuai.top", redisTemplate.opsForValue().get("url"));

		// 保存对象
		User user = new User("C++", "40");
		redisTemplate.opsForValue().set(user.getUsername(), JSONObject.toJSONString(user));

		user = new User("Java", "30");
		redisTemplate.opsForValue().set(user.getUsername(), JSONObject.toJSONString(user));

		user = new User("Python", "20");
		redisTemplate.opsForValue().set(user.getUsername(), JSONObject.toJSONString(user));

		System.out.println(redisTemplate.opsForValue().get("C++"));

	}
	
	@Test
	public void test1() {
		List<User> us = new ArrayList<>();
		User u1 = new User("rs1", "21");
		User u2 = new User("rs2", "22");
		User u3 = new User("rs3", "23");
		redisTemplate.opsForList().rightPush("list", JSONObject.toJSONString(u1));
		redisTemplate.opsForList().rightPush("list", JSONObject.toJSONString(u2));
		redisTemplate.opsForList().rightPush("list", JSONObject.toJSONString(u3));
		System.out.println("放入缓存》。。。。。。。。。。。。。。。。。。。");
		System.out.println("=============================");
		System.out.println(redisTemplate.opsForList().index("list", 0));
		System.out.println(redisTemplate.opsForList().index("list", 1));
		System.out.println(redisTemplate.opsForList().index("list", 2));
		System.out.println(redisTemplate.opsForList().index("list", 3));
		System.out.println(redisTemplate.opsForList().index("list", -1));
	}
	
	@Test
	public void test2() {
		List<Map<String,Object>> ms = new ArrayList<>();
		Map<String,Object> map = new HashMap<>();
		map.put("name", "rs");
		map.put("age", 20);
		
		Map<String,Object> map1 = new HashMap<>();
		map1.put("name", "rs1");
		map1.put("age", 21);
		
		Map<String,Object> map2 = new HashMap<>();
		map2.put("name", "rs2");
		map2.put("age", 22);
		
		ms.add(map);
		ms.add(map1);
		ms.add(map2);
		redisTemplate.opsForValue().set("key_ml", ms);
		System.out.println("放入缓存》。。。。。。。。。。。。。。。。。。。");
		System.out.println("=============================");
		List<Map<String,Object>> mls = (List<Map<String,Object>>)redisTemplate.opsForValue().get("key_ml");
		System.out.println("mls="+mls);
	}

}
