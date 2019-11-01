package com.emotte.springboot_test.service;

import com.emotte.springboot_test.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getAll();
    User getUserById(long id);
    int save(Map<String, Object> map);
    int update(Map<String, Object> map);
    int delete(long id);
}
