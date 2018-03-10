package com.xunyou.mapper;

import com.xunyou.model.TouristGuideRelationEntity;

public interface TouristGuideRelationEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TouristGuideRelationEntity record);

    int insertSelective(TouristGuideRelationEntity record);

    TouristGuideRelationEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TouristGuideRelationEntity record);

    int updateByPrimaryKey(TouristGuideRelationEntity record);
}