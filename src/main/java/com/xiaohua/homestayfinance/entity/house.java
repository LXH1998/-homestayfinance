package com.xiaohua.homestayfinance.entity;

/**
 * @author langxiaohua
 * @version 1.0
 * 房屋
 * @date 2020-02-28 9:26
 */
public class house {
    private String houseId;
    private String houseType;
    private String houseName;
    private String houseAddress;



    private String housePrice;
    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }



    public String getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(String housePrice) {
        this.housePrice = housePrice;
    }
    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

}
