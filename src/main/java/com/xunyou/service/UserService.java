package com.xunyou.service;

import com.xunyou.model.UserEntity;

import java.util.List;
import java.util.Map;


public interface  UserService {

    public UserEntity isUser(UserEntity entity);

    public int insert(UserEntity entity);

    public UserEntity selectIdByNameAndPwd(String username,String password);

    public int update(UserEntity entity);

    public UserEntity getall();

}
