package com.example.easyadminserviceframework.mapper;

import com.example.easyadminserviceframework.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<SysUser> findAll();

    SysUser findOne(String userName,String passWord);
}
