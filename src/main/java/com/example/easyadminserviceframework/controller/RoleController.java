package com.example.easyadminserviceframework.controller;

import com.example.easyadminserviceframework.common.enums.ResponseResult;
import com.example.easyadminserviceframework.entity.SysRole;
import com.example.easyadminserviceframework.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "角色模块")
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @ApiOperation("获取角色列表")
    @ResponseResult
    @GetMapping()
    public List<SysRole> getAll(){
        return roleService.getAll();
    }
}
