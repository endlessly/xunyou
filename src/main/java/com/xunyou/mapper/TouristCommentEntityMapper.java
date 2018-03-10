package com.xunyou.mapper;

import com.xunyou.model.TouristCommentEntity;

public interface TouristCommentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TouristCommentEntity record);

    int insertSelective(TouristCommentEntity record);

    TouristCommentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TouristCommentEntity record);

    int updateByPrimaryKey(TouristCommentEntity record);
}