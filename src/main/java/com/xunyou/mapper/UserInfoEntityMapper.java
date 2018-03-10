package com.xunyou.mapper;

import com.xunyou.model.UserInfoEntity;

public interface UserInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoEntity record);

    int insertSelective(UserInfoEntity record);

    UserInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfoEntity record);

    int updateByPrimaryKey(UserInfoEntity record);
}