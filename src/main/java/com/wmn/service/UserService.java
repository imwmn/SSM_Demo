package com.wmn.service;

import com.wmn.entity.Info;

public interface UserService {

    // 通过用户名及密码核查用户登录
    public Info checkLogin(String username, String password);

}
