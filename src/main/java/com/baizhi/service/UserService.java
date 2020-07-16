package com.baizhi.service;

import com.baizhi.entity.User;

/**
 * @author: timor
 * @date: 2020/7/16 16:47
 */
public interface UserService {

    void register(User user);

    User login(String username, String password);

}
