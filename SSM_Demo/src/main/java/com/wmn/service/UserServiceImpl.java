package com.wmn.service;

import com.wmn.dao.UserDaoImp;
import com.wmn.entity.Info;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class  UserServiceImpl implements UserService  {

    @Resource(name = "userDaoImp")
    private UserDaoImp  userDaoImp;

    /* 登陆验证 */
    @Override
    public Info checkLogin(String username, String password) {
        //根据用户名实例化用户对象
        Info user = userDaoImp.getUserByName(username);
        if (user != null && user.getPw().equals(password)) {
            return user;
        }
        return null;
    }
}
