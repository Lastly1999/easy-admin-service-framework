package com.example.easyadminserviceframework.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginActionPojo {
    private String UserName;
    private String PassWord;
}
