package com.xiaohua.homestayfinance.service.impl;

import com.xiaohua.homestayfinance.entity.User;
import com.xiaohua.homestayfinance.entity.house;
import com.xiaohua.homestayfinance.mapper.HouseMapper;
import com.xiaohua.homestayfinance.mapper.LoginMapper;
import com.xiaohua.homestayfinance.mapper.UserMapper;
import com.xiaohua.homestayfinance.service.HouseService;
import com.xiaohua.homestayfinance.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: LoginServiceImpl
 * @author:langxiaohua
 * @date: 2019/9/26 11:58
 * @Description :
 */
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;

    //查找所有房屋
    @Override
    public List<HashMap> selectAllHouse(int pages, int limit) {
        return houseMapper.selectAllHouse(pages,  limit);
    }
    //查找所有房屋数量
    @Override
    public int allHouseCount() {
        return houseMapper.selectAllHouseCount();
    }
    //根据分页查找房屋类别
    @Override
    public List<HashMap> selectPageHouseType(int pages, int limit) {
        return houseMapper.selectPageHouseType(pages,limit);
    }

    //查找所有房屋类别
    @Override
    public List<HashMap> selectAllHouseType() {
        return houseMapper.selectAllHouseType();
    }

    //查询所有房屋类别数量
    @Override
    public int selectAllHouseTypeCount() {
        return houseMapper.selectAllHouseTypeCount();
    }

    //模糊查询房屋
    @Override
    public List<HashMap> selectHouseByNameAndType(String houseName, String houseType, int pages, int limit) {
        return houseMapper.selectHouseByNameAndType(houseName,houseType,pages,limit);
    }
    //模糊查询房屋数量
    @Override
    public int selectHouseByNameAndTypeCount(String houseName, String houseType) {
        return houseMapper.selectHouseByNameAndTypeCount(houseName,houseType);
    }

    @Override
    public Boolean checkHouseName(String houseName) {
        return houseMapper.checkHouseName(houseName);
    }

    //修改房屋
    @Override
    public int updateHouse(house houseInfo) {
        return houseMapper.updateHouse(houseInfo);
    }

    //插入房屋
    @Override
    public int insertHouse(house houseInfo) {
        int ifInsert;
        try {
            houseMapper.insertHouse(houseInfo);
            ifInsert = 1;
        }catch (Exception e)
        {
            ifInsert = 0;
        }

        return ifInsert;
    }

    //删除房屋
    @Override
    public int deleteOneHouse(String houseId) {
        int ifDelete;
            try {
            houseMapper.deleteOneHouse(houseId);
                ifDelete = 1;
        }catch (Exception e)
        {
            ifDelete = 0;
        }

        return ifDelete;
    }
    //房屋类别模糊查找
    @Override
    public List<HashMap> selectHouseTypeByName(String housetypeName, int pages, int limit) {
        return houseMapper.selectHouseTypeByName(housetypeName,pages,limit);
    }
    //房屋类别模糊查找Count
    @Override
    public int selectHouseTypeByNameCount(String housetypeName) {
        return houseMapper.selectHouseTypeByNameCount(housetypeName);
    }

    //检查类别是否存在
    @Override
    public Boolean checkHousetypeName(String housetypeName) {
        return houseMapper.checkHousetypeName(housetypeName);
    }
    //插入房屋类别
    @Override
    public int insertHousetype(String housetypeName) {
        return houseMapper.insertHousetype(housetypeName);
    }

    //删除房屋类别
    @Override
    public int deleteOneHousetype(String housetypeId) {
        int ifDelete;
        try {
            houseMapper.deleteOneHousetype(housetypeId);
            ifDelete = 1;
        }catch (Exception e)
        {
            ifDelete = 0;
        }

        return ifDelete;
    }

    @Override
    public List<HashMap> selectHouseByTypeId(String housetypeId) {
        return houseMapper.selectHouseByTypeId(housetypeId);
    }

    @Override
    public List<HashMap> selectHouse() {
        return houseMapper.selectHouse();
    }

    @Override
    public List<HashMap> selectGoodsByTypeId(String housetypeId, int pages, int limit){
        return houseMapper.selectGoodsByTypeId(housetypeId,pages,limit);
    }

    @Override
    public int selectGoodsByTypeIdCount(String housetypeId) {
        return houseMapper.selectHouseTypeByNameCount(housetypeId);
    }

}
