package com.example.easyadminserviceframework.entity;

import java.util.Date;

public class SysDepartment {
    private Integer Id;
    private String DepName;
    private String DepIcon;
    private String depPath;
    private String depRemark;
    private String depPid;
    private Date createAt;
    private Date updateAt;
    private Date deleteAt;

    @Override
    public String toString() {
        return "SysDepartment{" +
                "Id=" + Id +
                ", DepName='" + DepName + '\'' +
                ", DepIcon='" + DepIcon + '\'' +
                ", depPath='" + depPath + '\'' +
                ", depRemark='" + depRemark + '\'' +
                ", depPid='" + depPid + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", deleteAt=" + deleteAt +
                '}';
    }
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDepName() {
        return DepName;
    }

    public void setDepName(String depName) {
        DepName = depName;
    }

    public String getDepIcon() {
        return DepIcon;
    }

    public void setDepIcon(String depIcon) {
        DepIcon = depIcon;
    }

    public String getDepPath() {
        return depPath;
    }

    public void setDepPath(String depPath) {
        this.depPath = depPath;
    }

    public String getDepRemark() {
        return depRemark;
    }

    public void setDepRemark(String depRemark) {
        this.depRemark = depRemark;
    }

    public String getDepPid() {
        return depPid;
    }

    public void setDepPid(String depPid) {
        this.depPid = depPid;
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
}
