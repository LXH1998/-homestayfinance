package com.xiaohua.homestayfinance.entity;

/**
 * @author langxiaohua
 * @version 1.0
 * 房屋物品
 * @date 2020-02-28 10:17
 */
public class housegoods {
    private  int housegoodsId;
    private  int housetypeId;
    private  int goodsId;
    private  int goodsNum;

    public int getHousegoodsId() {
        return housegoodsId;
    }

    public void setHousegoodsId(int housegoodsId) {
        this.housegoodsId = housegoodsId;
    }

    public int getHousetypeId() {
        return housetypeId;
    }

    public void setHousetypeId(int housetypeId) {
        this.housetypeId = housetypeId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }



}
