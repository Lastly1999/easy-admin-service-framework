package com.example.easyadminserviceframework.service.Impl;

import com.example.easyadminserviceframework.entity.SysUser;
import com.example.easyadminserviceframework.mapper.UserMapper;
import com.example.easyadminserviceframework.pojo.LoginActionPojo;
import com.example.easyadminserviceframework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<SysUser> getAll() {
        return userMapper.findAll();
    }

    @Override
    public SysUser findUser(LoginActionPojo loginActionPojo) {
        SysUser sysUser = userMapper.findOne(loginActionPojo.getUserName(),loginActionPojo.getPassWord());
        return sysUser;
    }
}
