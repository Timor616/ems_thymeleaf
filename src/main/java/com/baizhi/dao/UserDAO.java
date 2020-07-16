package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author: timor
 * @date: 2020/7/16 16:42
 */
public interface UserDAO {

    void save(User user);

    User login(@Param("username") String username, @Param("password") String password);
}
