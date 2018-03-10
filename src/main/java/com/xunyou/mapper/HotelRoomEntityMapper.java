package com.xunyou.mapper;

import com.xunyou.model.HotelRoomEntity;

public interface HotelRoomEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelRoomEntity record);

    int insertSelective(HotelRoomEntity record);

    HotelRoomEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelRoomEntity record);

    int updateByPrimaryKeyWithBLOBs(HotelRoomEntity record);

    int updateByPrimaryKey(HotelRoomEntity record);
}