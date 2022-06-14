package com.example.easyadminserviceframework.service.Impl;

import com.example.easyadminserviceframework.entity.SysDepartment;
import com.example.easyadminserviceframework.mapper.DepartmentMapper;
import com.example.easyadminserviceframework.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<SysDepartment> getAll() {
        return departmentMapper.getAll();
    }
}
