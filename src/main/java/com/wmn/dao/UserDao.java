package com.wmn.dao;

import com.wmn.entity.Info;

public interface UserDao {

    public Info getUserByName(String username);
}
