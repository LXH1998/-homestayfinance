package com.xiaohua.homestayfinance.entity;

public class Rolepower{
    private Integer rolepower_Id;
    private Integer role_Id;
    private Integer power_Id;
    private String power_state;

    public String getPower_state() {
        return power_state;
    }

    public void setPower_state(String power_state) {
        this.power_state = power_state;
    }

    public Integer getRolepower_Id() {
        return rolepower_Id;
    }

    public void setRolepower_Id(Integer rolepower_Id) {
        this.rolepower_Id = rolepower_Id;
    }

    public Integer getRole_Id() {
        return role_Id;
    }

    public void setRole_Id(Integer role_Id) {
        this.role_Id = role_Id;
    }

    public Integer getPower_Id() {
        return power_Id;
    }

    public void setPower_Id(Integer power_Id) {
        this.power_Id = power_Id;
    }
}
