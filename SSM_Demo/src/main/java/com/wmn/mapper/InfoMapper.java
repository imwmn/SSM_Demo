package com.wmn.mapper;

import com.wmn.entity.Info;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface InfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);

     Info getUserByName(String username);
}