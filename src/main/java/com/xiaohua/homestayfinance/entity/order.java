package com.xiaohua.homestayfinance.entity;

import java.util.Date;

/**
 * @author langxiaohua
 * 订单
 * @version 1.0
 * @date 2020-02-28 10:26
 */
public class order {
    private int orderId;
    private int houseId;
    private int housetypeId;
    private String tenantName;
    private String tenantSex;
    private String tenantAge;
    private String isDamage; //是否损坏物品

    private Date checkinTime;
    private Date departureTime;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public int getHousetypeId() {
        return housetypeId;
    }

    public void setHousetypeId(int housetypeId) {
        this.housetypeId = housetypeId;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantSex() {
        return tenantSex;
    }

    public void setTenantSex(String tenantSex) {
        this.tenantSex = tenantSex;
    }

    public String getTenantAge() {
        return tenantAge;
    }

    public void setTenantAge(String tenantAge) {
        this.tenantAge = tenantAge;
    }

    public String getIsDamage() {
        return isDamage;
    }

    public void setIsDamage(String isDamage) {
        this.isDamage = isDamage;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }


}
