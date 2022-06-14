package com.example.easyadminserviceframework.service;

import com.example.easyadminserviceframework.entity.SysUser;
import com.example.easyadminserviceframework.pojo.LoginActionPojo;
import com.example.easyadminserviceframework.vo.CreateCaptchaVo;

import java.io.IOException;

public interface AuthService {
    SysUser loginAction(LoginActionPojo loginActionPojo);
    CreateCaptchaVo CreateCaptcha() throws IOException;
}
