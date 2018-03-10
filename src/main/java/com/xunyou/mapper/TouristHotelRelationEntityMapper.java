package com.xunyou.mapper;

import com.xunyou.model.TouristHotelRelationEntity;

public interface TouristHotelRelationEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TouristHotelRelationEntity record);

    int insertSelective(TouristHotelRelationEntity record);

    TouristHotelRelationEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TouristHotelRelationEntity record);

    int updateByPrimaryKey(TouristHotelRelationEntity record);
}