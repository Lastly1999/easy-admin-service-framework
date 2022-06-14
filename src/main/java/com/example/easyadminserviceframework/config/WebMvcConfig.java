package com.example.easyadminserviceframework.config;

import com.example.easyadminserviceframework.common.interceptor.ResponseResultInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 添加自定义拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ResponseResultInterceptor()).addPathPatterns("/**");
    }
}