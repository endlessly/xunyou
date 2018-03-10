package com.xunyou.mapper;

import com.xunyou.model.HotelRoomScheduledEntity;

public interface HotelRoomScheduledEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelRoomScheduledEntity record);

    int insertSelective(HotelRoomScheduledEntity record);
}