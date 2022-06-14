package com.example.easyadminserviceframework.controller;

import com.example.easyadminserviceframework.common.enums.ResponseResult;
import com.example.easyadminserviceframework.entity.SysUser;
import com.example.easyadminserviceframework.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户模块")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseResult
    @ApiOperation("获取用户列表")
    @GetMapping()
    public List<SysUser> getAll(){
        return this.userService.getAll();
    }
}
