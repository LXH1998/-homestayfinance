package com.xiaohua.homestayfinance.service.impl;

import com.xiaohua.homestayfinance.entity.goods;
import com.xiaohua.homestayfinance.mapper.GoodsMapper;
import com.xiaohua.homestayfinance.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author langxiaohua
 * date 2020-03-10
 */
@Service
public class GoodsServiceimpl implements GoodsService {
    @Autowired
    private GoodsMapper GoodsMapper;
    //根据分页查找物品
    @Override
    public List<HashMap> selectGoodsPage(int pages, int limit) {
        return GoodsMapper.selectGoodsPage(pages,limit);
    }
    //查找所有物品数量
    @Override
    public int selectGoodsCount() {
        return GoodsMapper.selectGoodsCount();
    }
    //物品模糊查找
    @Override
    public List<HashMap> selectGoodsByName(String goodsName, int pages, int limit) {
        return GoodsMapper.selectGoodsByName(goodsName,pages,limit);
    }
    //物品模糊查找Count
    @Override
    public int selectGoodsByNameCount(String goodsName) {
        return GoodsMapper.selectGoodsByNameCount(goodsName);
    }
    //判断物品名称是否存在
    @Override
    public Boolean checkGoodsName(String goodsName) {
        return GoodsMapper.checkGoodsName(goodsName);
    }
    //插入物品
    @Override
    public int insertGoods(goods goodsInfo) {
        return GoodsMapper.insertGoods(goodsInfo);
    }
    //删除物品
    @Override
    public int deleteGoods(String goodsId) {
        return GoodsMapper.deleteGoods(goodsId);
    }
    //修改物品
    @Override
    public int updateGoods(goods houseInfo) {
        return GoodsMapper.updateGoods(houseInfo);
    }
}
