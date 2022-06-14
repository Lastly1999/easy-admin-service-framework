package com.example.easyadminserviceframework.mapper;

import com.example.easyadminserviceframework.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    List<SysRole> getAll();
}
