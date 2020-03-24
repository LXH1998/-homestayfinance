package com.xiaohua.homestayfinance.entity;

/**
 * @author langxiaohua
 * @version 1.0
 * 房屋类型
 * @date 2020-02-28 10:25
 */
public class housetype {
    public int getHousetypeId() {
        return housetypeId;
    }

    public void setHousetypeId(int housetypeId) {
        this.housetypeId = housetypeId;
    }

    public String getHousetypeName() {
        return housetypeName;
    }

    public void setHousetypeName(String housetypeName) {
        this.housetypeName = housetypeName;
    }

    private int housetypeId;
    private String housetypeName;

}
