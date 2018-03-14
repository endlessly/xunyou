package com.xunyou.mapper;

import com.xunyou.model.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface UserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
    UserEntity selectByUserNameAndPwd(String username, String password);
 //   UserEntity selectByUserNameAndPwd(@Param("username")String username, @Param("password")String password);

}