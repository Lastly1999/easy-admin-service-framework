package com.example.easyadminserviceframework.controller;

import com.example.easyadminserviceframework.common.enums.ResponseResult;
import com.example.easyadminserviceframework.entity.SysDepartment;
import com.example.easyadminserviceframework.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "部门模块")
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @ResponseResult
    @ApiOperation("获取部门列表")
    @GetMapping()
    public List<SysDepartment> get(){
        return departmentService.getAll();
    }
}
