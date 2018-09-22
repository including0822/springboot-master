package com.thisy.dao.user;

import com.thisy.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author inclouding
 * @create 2018-09-22 15:08
 * @desc
 **/
@Mapper
public interface UserDao {
    User selectById(Integer dbId) ;
}
