package com.xiaohua.homestayfinance.mapper;

import com.xiaohua.homestayfinance.entity.User;
import com.xiaohua.homestayfinance.entity.house;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: HourseMapper
 * @author:langxiaohua
 * @date: 2019/9/26 11:56
 * @Description :
 */

@Repository
public interface HouseMapper {
    //查找所有房屋
    List<HashMap>  selectAllHouse(int pages, int limit);
    //查找所有房屋数量
    int selectAllHouseCount();

    //查找所有房屋类别
    List<HashMap> selectAllHouseType();

    //根据分页查找房屋类别
    List<HashMap> selectPageHouseType(int pages, int limit);
    //查找所有房屋类别数量
    int selectAllHouseTypeCount();

    //房屋模糊查找
    List<HashMap> selectHouseByNameAndType(String houseName,String houseType,int pages, int limit);

    //房屋模糊查找Count
   int selectHouseByNameAndTypeCount(String houseName,String houseType);
   //判断房屋名称是否重复
    Boolean checkHouseName(String houseName);

    //插入房屋
    int insertHouse(house houseInfo);

    //删除房屋
    int deleteOneHouse(String houseId);

    //修改房屋
    int updateHouse(house houseInfo);



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
