package com.xiaohua.homestayfinance.controller;

import com.xiaohua.homestayfinance.entity.goods;
import com.xiaohua.homestayfinance.entity.house;
import com.xiaohua.homestayfinance.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author langxiaohua
 * date 2020-03-10
 */

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    //跳转到物品页面
    @RequestMapping("goGoodsList")
    public String goGoodsList()
    {
        return "admin/goods/goodsIndex";
    }

    //跳转到物品编辑页面
    @RequestMapping("goGoodsEdit")
    public String goGoodsEdit()
    {
        return "admin/goods/goodsEdit";
    }

    //查询所有物品
    @ResponseBody
    @RequestMapping("allGoodsDate")
    public Map allGoodsDate(int page, int limit)
    {
        int pages=(page-1)*limit;
        Map result=new HashMap();
        List<HashMap> goodsList = goodsService.selectGoodsPage(pages,limit);
        int goodsCount = goodsService.selectGoodsCount();
        result.put("code",0);
        result.put("msg","");
        result.put("count",goodsCount);
        result.put("data",goodsList);
        return result;
    }

    //物品模糊查询
    @ResponseBody
    @RequestMapping("selectGoodsByName")
    public Map selectGoodsByName(String goodsName,int page,int limit){
        int pages=(page-1)*limit;
        Map result=new HashMap();
        List<HashMap> goodsList = goodsService.selectGoodsByName(goodsName,pages,limit);
        int goodsCount = goodsService.selectGoodsByNameCount(goodsName);
        result.put("code",0);
        result.put("msg","");
        result.put("count",goodsCount);
        result.put("data",goodsList);
        return result;
    }

    //检查物品是否已经存在
    @ResponseBody
    @RequestMapping("/checkGoodsName")
    public Boolean checkGoodsName(String goodsName){
        Boolean ifRepeat = goodsService.checkGoodsName(goodsName);
        return ifRepeat;
    }

    //插入物品
    @ResponseBody
    @RequestMapping("/insertGoods")
    public int insertHouse(
            @RequestParam("goodsName") String goodsName,
            @RequestParam("goodsPlace") String goodsPlace
    ){
        goods goodsInfo = new goods();
        goodsInfo.setGoodsName(goodsName);
        goodsInfo.setGoodsPlace(goodsPlace);
        int ifInsert = goodsService.insertGoods(goodsInfo);
        return ifInsert;
    }

    //删除房屋
    @ResponseBody
    @RequestMapping("/deleteGoods")
    public String deleteGoods(String goodsId){
        int ifDelete  = goodsService.deleteGoods(goodsId);
        if(ifDelete == 1)
        {
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    //修改物品属性
    @ResponseBody
    @RequestMapping("/updateGoods")
    public int updateGoods(
            @RequestParam("goodsId") int goodsId,
            @RequestParam("goodsName") String goodsName,
            @RequestParam("goodsPlace") String goodsPlace
    ){
        goods goodsInfo = new goods();
        goodsInfo.setGoodsName(goodsName);
        goodsInfo.setGoodsId(goodsId);
        goodsInfo.setGoodsPlace(goodsPlace);
        int ifUpdate = goodsService.updateGoods(goodsInfo);
        return ifUpdate;
    }
}
