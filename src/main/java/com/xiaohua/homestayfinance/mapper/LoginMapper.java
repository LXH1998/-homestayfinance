package com.xiaohua.homestayfinance.mapper;

import com.xiaohua.homestayfinance.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: LoginMapper
 * @author:xiaoyi
 * @date: 2019/9/26 11:56
 * @Description :
 */

@Repository
public interface LoginMapper {
    List<User>  loginUser(User u);
}
