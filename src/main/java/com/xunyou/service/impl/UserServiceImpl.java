package com.xunyou.service.impl;

import com.xunyou.mapper.UserEntityMapper;
import com.xunyou.model.UserEntity;
import com.xunyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserEntityMapper userEntityMapper;
    @Override
    public UserEntity getall() {
        return null;
    }

    @Override
    public int update(UserEntity entity) {
        return 0;
    }

    @Override
    public UserEntity selectIdByNameAndPwd(String username ,String password) {
        List list;
        UserEntity user =userEntityMapper.selectByUserNameAndPwd(username,password);
       if (null==user){
           return  null;
       }else {
           return  user;
       }
    }

    @Override
    public UserEntity isUser(UserEntity entity) {
        return null;
    }

    @Override
    public int insert(UserEntity entity) {
        return 0;
    }
}
