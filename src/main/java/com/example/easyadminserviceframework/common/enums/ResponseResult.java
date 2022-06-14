package com.example.easyadminserviceframework.common.enums;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})  //作用于方法和类（接口）上
@Documented
public @interface ResponseResult {
}