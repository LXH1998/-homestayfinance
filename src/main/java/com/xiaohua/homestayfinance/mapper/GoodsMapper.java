package com.xiaohua.homestayfinance.mapper;

import com.xiaohua.homestayfinance.entity.goods;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: GoodsMapper
 * @author:langxiaohua
 * @date: 2019/9/26 11:56
 * @Description :
 */

@Repository
public interface GoodsMapper {
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
