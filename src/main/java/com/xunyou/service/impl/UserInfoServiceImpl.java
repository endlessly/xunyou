package com.xunyou.service.impl;

import com.xunyou.mapper.UserEntityMapper;
import com.xunyou.mapper.UserInfoEntityMapper;
import com.xunyou.model.UserEntity;
import com.xunyou.model.UserInfoEntity;
import com.xunyou.service.UserInfoService;
import com.xunyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    UserInfoEntityMapper userInfoEntityMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(UserInfoEntity record) {
        record.setCreateDate(new Date());
        record.setUpdateDate(new Date());
    int result = userInfoEntityMapper.insert(record);
    if (0==result)return 0;
        System.out.println(result);
        return result;
    }

    @Override
    public int insertSelective(UserInfoEntity record) {
        return 0;
    }

    @Override
    public UserInfoEntity selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfoEntity record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserInfoEntity record) {
        return 0;
    }
}
