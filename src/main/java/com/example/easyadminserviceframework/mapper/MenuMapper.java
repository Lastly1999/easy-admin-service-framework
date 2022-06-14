package com.example.easyadminserviceframework.mapper;

import com.example.easyadminserviceframework.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<SysMenu> getAll();
}
