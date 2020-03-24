package com.xiaohua.homestayfinance.service;

import com.xiaohua.homestayfinance.entity.User;
import com.xiaohua.homestayfinance.entity.house;

import java.util.HashMap;
import java.util.List;

public interface HouseService {
    List<HashMap> selectAllHouse(int pages, int limit);

    int allHouseCount();
    List<HashMap> selectPageHouseType(int pages, int limit);
    List<HashMap> selectAllHouseType();
    int selectAllHouseTypeCount();
    List<HashMap> selectHouseByNameAndType(String houseName,String houseType,int pages, int limit);

   int selectHouseByNameAndTypeCount(String houseName,String houseType);
   Boolean checkHouseName(String houseName);
    //修改房屋
    int updateHouse(house houseInfo);


    int insertHouse(house houseInfo);

    int deleteOneHouse(String houseId);
    //房屋类别模糊查找
    List<HashMap> selectHouseTypeByName(String housetypeName,int pages, int limit);

    //房屋类别模糊查找Count
    int selectHouseTypeByNameCount(String housetypeName);
    //判断房屋类别是否存在
    Boolean checkHousetypeName(String housetypeName);

    //插入房屋类别
    int insertHousetype(String housetypeName);
    //删除房屋类别
    int deleteOneHousetype(String housetypeId);

    //根据类别ID查询对应类别下的房屋
    List<HashMap> selectHouseByTypeId(String housetypeId);
    List<HashMap> selectHouse();

    //根据房屋类别查找房屋物品（分页）
    List<HashMap> selectGoodsByTypeId(String housetypeId,int pages, int limit);
    //根据房屋类别查找房屋物品数量
    int selectGoodsByTypeIdCount(String housetypeId);
}
