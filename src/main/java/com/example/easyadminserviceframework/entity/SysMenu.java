package com.example.easyadminserviceframework.entity;

import java.util.Date;

public class SysMenu {

    private Integer Id;
    private String menuName;
    private String menuPid;
    private String menuPath;
    private Date createAt;
    private Date updateAt;
    private Date deleteAt;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuPid() {
        return menuPid;
    }

    public void setMenuPid(String menuPid) {
        this.menuPid = menuPid;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
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


    @Override
    public String toString() {
        return "SysMenu{" +
                "Id=" + Id +
                ", menuName='" + menuName + '\'' +
                ", menuPid='" + menuPid + '\'' +
                ", menuPath='" + menuPath + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", deleteAt=" + deleteAt +
                '}';
    }
}
