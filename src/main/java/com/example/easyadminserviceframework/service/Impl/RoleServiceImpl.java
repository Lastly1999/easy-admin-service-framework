package com.example.easyadminserviceframework.service.Impl;

import com.example.easyadminserviceframework.entity.SysRole;
import com.example.easyadminserviceframework.mapper.RoleMapper;
import com.example.easyadminserviceframework.service.RoleService;
import com.example.easyadminserviceframework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<SysRole> getAll() {
        return roleMapper.getAll();
    }
}
