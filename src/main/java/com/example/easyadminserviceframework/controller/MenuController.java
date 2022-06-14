package com.example.easyadminserviceframework.controller;

import com.example.easyadminserviceframework.common.enums.ResponseResult;
import com.example.easyadminserviceframework.entity.SysMenu;
import com.example.easyadminserviceframework.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "系统菜单")
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @ResponseResult
    @ApiOperation("获取系统菜单列表")
    @GetMapping()
    public List<SysMenu> getAll(){
        return menuService.getAll();
    }
}
