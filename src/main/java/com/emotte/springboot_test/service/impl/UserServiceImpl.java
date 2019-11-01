package com.emotte.springboot_test.service.impl;

import com.emotte.springboot_test.entity.User;
import com.emotte.springboot_test.mapper.UserMapper;
import com.emotte.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: springboot_test
 * @description:
 * @author: dj
 * @create: 2019-10-31 15:50
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getUserById(long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public int save(Map<String, Object> map) {
        return userMapper.save(map);
    }

    @Override
    public int update(Map<String, Object> map) {
        return userMapper.update(map);
    }

    @Override
    public int delete(long id) {
        return userMapper.delete(id);
    }
}
