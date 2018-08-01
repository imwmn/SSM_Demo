package com.wmn.dao;

import com.wmn.entity.Info;
import com.wmn.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository
public class UserDaoImp  implements UserDao {

 @Resource(name = "infoMapper")
    private InfoMapper infoMapper;

    @Override
    public Info getUserByName(String username) {
        return infoMapper.getUserByName(username);
    }
}
