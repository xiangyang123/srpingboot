package com.provider.service.impl;

import bean.User;
import com.provider.dao.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zouxiang on 2017/7/11.
 */
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
