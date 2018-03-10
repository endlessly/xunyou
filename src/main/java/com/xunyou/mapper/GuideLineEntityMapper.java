package com.xunyou.mapper;

import com.xunyou.model.GuideLineEntity;

public interface GuideLineEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GuideLineEntity record);

    int insertSelective(GuideLineEntity record);

    GuideLineEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GuideLineEntity record);

    int updateByPrimaryKey(GuideLineEntity record);
}