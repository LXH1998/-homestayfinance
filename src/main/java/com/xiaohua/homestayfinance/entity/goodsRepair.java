package com.xiaohua.homestayfinance.entity;

/**
 * @author langxiaohua
 * @version 1.0
 *物品维修
 * @date 2020-02-28 9:48
 */
public class goodsRepair {
    private String goodsrepairId;
    private String goodsId;
    private String repairPlace;
    private String repairType;
    private String orderId;

    public String getGoodsrepairId() {
        return goodsrepairId;
    }

    public void setGoodsrepairId(String goodsrepairId) {
        this.goodsrepairId = goodsrepairId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getRepairPlace() {
        return repairPlace;
    }

    public void setRepairPlace(String repairPlace) {
        this.repairPlace = repairPlace;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


}
