package com.example.easyadminserviceframework.mapper;

import com.example.easyadminserviceframework.entity.SysDepartment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<SysDepartment> getAll();
}
