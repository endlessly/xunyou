package com.xunyou.service;

import com.xunyou.model.UserInfoEntity;

public interface UserInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoEntity record);

    int insertSelective(UserInfoEntity record);

    UserInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfoEntity record);

    int updateByPrimaryKey(UserInfoEntity record);
}
