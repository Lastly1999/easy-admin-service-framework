package com.example.easyadminserviceframework.entity;

import java.util.Date;

public class SysUser {

    public SysUser(){}

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNikeName() {
        return NikeName;
    }

    public void setNikeName(String nikeName) {
        NikeName = nikeName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }

    private String UserName;
    private String PassWord;
    private String Email;
    private String NikeName;
    private String Address;
    private Date createAt;
    private Date updateAt;
    private Date deleteAt;

    @Override
    public String toString() {
        return "SysUser{" +
                "UserName='" + UserName + '\'' +
                ", PassWord='" + PassWord + '\'' +
                ", Email='" + Email + '\'' +
                ", NikeName='" + NikeName + '\'' +
                ", Address='" + Address + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", deleteAt=" + deleteAt +
                '}';
    }
}
