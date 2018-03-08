package com.xunyou.mapper;

import com.xunyou.model.UserEntity;

import java.util.Map;

public interface UserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
    UserEntity selectByUserNameAndPwd();
}