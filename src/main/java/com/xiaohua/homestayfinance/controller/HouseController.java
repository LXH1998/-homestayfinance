package com.xiaohua.homestayfinance.controller;

import com.xiaohua.homestayfinance.entity.house;
import com.xiaohua.homestayfinance.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author langxiaohua
 * date 2020-03-09
 * 房屋管理控制器
 */
@Controller
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService houseService;

    //跳转到添加、修改页面
    @RequestMapping("goHouseEdit")
    public String goHouseEdit()
    {
        return "admin/house/houseEdit";
    }

    //跳转到房屋列表
    @RequestMapping("goHouseIndex")
    public String goHouseIndex()
    {
        return "admin/house/houseIndex";
    }

    //跳转到房屋类别列表
    @RequestMapping("goHouseType")
    public String goHouseType()
    {
        return "admin/house/houseType";
    }

    //跳转到类别房屋页面(设置列表里包含的房屋)
    @RequestMapping("goTypeHouse")
    public String goTypeHouse()
    {
        return "admin/house/typeHouse";
    }

    //跳转到房屋物品
    @RequestMapping("goHouseGoods")
    public String goHouseGoods()
    {
        return "admin/house/houseGoods";
    }

    //查询所有房屋
    @ResponseBody
    @RequestMapping("allHouseDate")
    public Map selectAllHouse(int page,int limit)
    {
        int pages=(page-1)*limit;
        Map result=new HashMap();
        List<HashMap> houseList = houseService.selectAllHouse(pages,limit);
        int houstCount = houseService.allHouseCount();
        result.put("code",0);
        result.put("msg","");
        result.put("count",houstCount);
        result.put("data",houseList);
        return result;
    }

    //房屋类别Lsit
    @ResponseBody
    @RequestMapping("houseTypeList")
    public Map selectAllHouseType(){
        Map result=new HashMap();
        List<HashMap> houseTypes = houseService.selectAllHouseType();
        result.put("data",houseTypes);
        return result;
    }

    //房屋条件模糊查询
    @ResponseBody
    @RequestMapping("selectHouseByNameAndType")
    public Map selectAccountUsers(String houseName,String houseType,int page,int limit){
        int pages=(page-1)*limit;
        Map result=new HashMap();
        List<HashMap> houseList = houseService.selectHouseByNameAndType(houseName,houseType,pages,limit);
        int houseCount = houseService.selectHouseByNameAndTypeCount(houseName,houseType);
        result.put("code",0);
        result.put("msg","");
        result.put("count",houseCount);
        result.put("data",houseList);
        return result;
    }

    //检查房屋是否已经存在
    @ResponseBody
    @RequestMapping("/checkHouseName")
    public Boolean checkHouseName(String houseName){
       Boolean ifRepeat = houseService.checkHouseName(houseName);

        return ifRepeat;
    }
    //插入房屋
    @ResponseBody
    @RequestMapping("/insertHouse")
    public int insertHouse(
            @RequestParam("houseName") String houseName,
                           @RequestParam("houseType") String houseType,
                           @RequestParam("houseAddress") String houseAddress,
                           @RequestParam("housePrice") Double housePrice
    ){

        house  houseInfo = new house();
        houseInfo.setHouseName(houseName);
        houseInfo.setHouseType(houseType);
        houseInfo.setHouseAddress(houseAddress);
        houseInfo.setHousePrice(housePrice);
        int ifInsert = houseService.insertHouse(houseInfo);
        return ifInsert;
    }

    //删除房屋
    @ResponseBody
    @RequestMapping("/deleteOneHouse")
    public String deleteOneHouse(String houseId){
        int ifDelete  = houseService.deleteOneHouse(houseId);
        if(ifDelete == 1)
        {
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    //修改房屋
    @ResponseBody
    @RequestMapping("/updateHouse")
    public int updateHouse(
            @RequestParam("houseId") int houseId,
            @RequestParam("houseName") String houseName,
            @RequestParam("houseType") String houseType,
            @RequestParam("houseAddress") String houseAddress,
            @RequestParam("housePrice") Double housePrice
    ){

        house  houseInfo = new house();
        houseInfo.setHouseId(houseId);
        houseInfo.setHouseName(houseName);
        houseInfo.setHouseType(houseType);
        houseInfo.setHouseAddress(houseAddress);
        houseInfo.setHousePrice(housePrice);
        int ifUpdate = houseService.updateHouse(houseInfo);
        return ifUpdate;
    }


    //查询所有房屋类别
    @ResponseBody
    @RequestMapping("selectHouseType")
    public Map selectPageHouseType(int page,int limit)
    {
        int pages=(page-1)*limit;
        Map result=new HashMap();
        List<HashMap> houseTypeList = houseService.selectPageHouseType(pages,limit);
        int houstTypeCount = houseService.selectAllHouseTypeCount();
        result.put("code",0);
        result.put("msg","");
        result.put("count",houstTypeCount);
        result.put("data",houseTypeList);
        return result;
    }

    //房屋类别名模糊查询
    @ResponseBody
    @RequestMapping("selectHouseTypeByName")
    public Map selectHouseTypeByName(String housetypeName,int page,int limit){
        int pages=(page-1)*limit;
        Map result=new HashMap();
        List<HashMap> houseTypeList = houseService.selectHouseTypeByName(housetypeName,pages,limit);
        int houseTypeCount = houseService.selectHouseTypeByNameCount(housetypeName);
        result.put("code",0);
        result.put("msg","");
        result.put("count",houseTypeCount);
        result.put("data",houseTypeList);
        return result;
    }
    //检查房屋类别是否已经存在
    @ResponseBody
    @RequestMapping("/checkHousetypeName")
    public Boolean checkHousetypeName(String housetypeName){
        Boolean ifRepeat = houseService.checkHousetypeName(housetypeName);
        return ifRepeat;
    }
    //插入房屋类别
    @ResponseBody
    @RequestMapping("insertHousetype")
    public int insertHousetype(
            @RequestParam("housetypeName") String housetypeName){
        int ifInsert = houseService.insertHousetype(housetypeName);
        return ifInsert;
    }

    //删除房屋
    @ResponseBody
    @RequestMapping("/deleteOneHousetype")
    public String deleteOneHousetype(String housetypeId){
        int ifDelete  = houseService.deleteOneHousetype(housetypeId);
        if(ifDelete == 1)
        {
            return "删除成功";
        }else {
            return "删除事变";
        }
    }


    //根据类别ID返回对应类别的房屋
    @ResponseBody
    @RequestMapping("selectHouseByTypeId")
    public Map selectHouseByTypeId(String housetypeId){
        Map result=new HashMap();
        List<Integer> houseIndex = new ArrayList<>();
        List<HashMap> houseAll = houseService.selectHouse();
        List<HashMap> houseTypeOf = houseService.selectHouseByTypeId(housetypeId);
        if(houseAll.size()!=0 && houseTypeOf.size()!=0){
            for(int i =0;i<houseAll.size();i++){
                houseAll.get(i).put("value", houseAll.get(i).remove("house_id"));
                houseAll.get(i).put("title", houseAll.get(i).remove("house_name"));
                for(HashMap map1:houseTypeOf){
                    if(houseAll.get(i).get("value").equals(map1.get("house_id")))
                    {
                        houseIndex.add(i+1);
                    }
                }
            }
        }
      
        result.put("data",houseAll);
        result.put("houseIndex",houseIndex);
        return result;
    }


    //查询所有房屋
    @ResponseBody
    @RequestMapping("GoodsByHouseType")
    public Map selectGoodsByTypeId(String housetypeId,int page,int limit)
    {
        int pages=(page-1)*limit;
        Map result=new HashMap();
        List<HashMap> houseList = houseService.selectGoodsByTypeId(housetypeId,pages,limit);
        int houstCount = houseService.selectGoodsByTypeIdCount(housetypeId);
        result.put("code",0);
        result.put("msg","");
        result.put("count",houstCount);
        result.put("data",houseList);
        return result;
    }


}
