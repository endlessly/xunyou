package com.xunyou.mapper;

import com.xunyou.model.TagEntity;

public interface TagEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TagEntity record);

    int insertSelective(TagEntity record);

    TagEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TagEntity record);

    int updateByPrimaryKey(TagEntity record);
}