package com.example.easyadminserviceframework.service.Impl;

import com.example.easyadminserviceframework.entity.SysMenu;
import com.example.easyadminserviceframework.mapper.MenuMapper;
import com.example.easyadminserviceframework.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<SysMenu> getAll() {
        return menuMapper.getAll();
    }
}
