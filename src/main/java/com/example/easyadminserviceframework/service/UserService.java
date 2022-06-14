package com.example.easyadminserviceframework.service;

import com.example.easyadminserviceframework.entity.SysUser;
import com.example.easyadminserviceframework.pojo.LoginActionPojo;

import java.util.List;

public interface UserService {
    List<SysUser> getAll();

    SysUser findUser(LoginActionPojo loginActionPojo);
}
