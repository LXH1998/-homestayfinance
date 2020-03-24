package com.xiaohua.homestayfinance.service;

import com.xiaohua.homestayfinance.entity.goods;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author langxiaohua
 * date 2020-03-10
 */

public interface GoodsService {
    //根据分页查找物品
    List<HashMap> selectGoodsPage(int pages, int limit);
    //查找所有物品数量
    int selectGoodsCount();

    //物品模糊查找
    List<HashMap> selectGoodsByName(String goodsName,int pages, int limit);

    //物品模糊查找Count
    int selectGoodsByNameCount(String goodsName);

    //判断物品名称是否存在
    Boolean checkGoodsName(String goodsName);

    //插入物品
    int insertGoods(goods goodsInfo);

    //删除物品
    int deleteGoods(String goodsId);

    //修改物品
    int updateGoods(goods houseInfo);
}
