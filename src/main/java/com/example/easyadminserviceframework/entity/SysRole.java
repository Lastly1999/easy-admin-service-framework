package com.example.easyadminserviceframework.entity;

import java.util.Date;

public class SysRole {

    private Integer Id;
    private String RoleName;
    private String roleRemark;
    private String createAt;
    private Date updateAt;
    private Date deleteAt;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
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
        return "SysRole{" +
                "Id=" + Id +
                ", RoleName='" + RoleName + '\'' +
                ", roleRemark='" + roleRemark + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateAt=" + updateAt +
                ", deleteAt=" + deleteAt +
                '}';
    }

}
