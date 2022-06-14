package com.example.easyadminserviceframework.controller;

import com.example.easyadminserviceframework.common.enums.ResponseResult;
import com.example.easyadminserviceframework.entity.SysUser;
import com.example.easyadminserviceframework.pojo.LoginActionPojo;
import com.example.easyadminserviceframework.service.AuthService;
import com.example.easyadminserviceframework.vo.CreateCaptchaVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Api(tags = "权限")
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @ResponseResult
    @ApiOperation(value = "系统登录")
    @PostMapping("/login")
    public SysUser loginAction(@RequestBody() LoginActionPojo loginActionPojo){
        return authService.loginAction(loginActionPojo);
    }

    @ResponseResult
    @ApiOperation(value = "获取图片验证码")
    @GetMapping("/captcha")
    public CreateCaptchaVo createCaptcha() throws IOException {
        return authService.CreateCaptcha();
    }
}
