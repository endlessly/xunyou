package com.xunyou.mapper;

import com.xunyou.model.GuideInfoEntity;

public interface GuideInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GuideInfoEntity record);

    int insertSelective(GuideInfoEntity record);

    GuideInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GuideInfoEntity record);

    int updateByPrimaryKey(GuideInfoEntity record);
}