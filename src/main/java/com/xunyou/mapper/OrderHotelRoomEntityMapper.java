package com.xunyou.mapper;

import com.xunyou.model.OrderHotelRoomEntity;

public interface OrderHotelRoomEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderHotelRoomEntity record);

    int insertSelective(OrderHotelRoomEntity record);

    OrderHotelRoomEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderHotelRoomEntity record);

    int updateByPrimaryKey(OrderHotelRoomEntity record);
}