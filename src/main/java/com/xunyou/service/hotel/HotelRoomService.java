package com.xunyou.service.hotel;


import com.xunyou.model.HotelRoomEntity;

public interface HotelRoomService {

    int deleteByPrimaryKey(Integer id);

    int insert(HotelRoomEntity record);

    int insertSelective(HotelRoomEntity record);

    HotelRoomEntity selectByPrimaryKey(Integer id);

    HotelRoomEntity selectByHotelNo(String hotelNo);

    int updateByPrimaryKeySelective(HotelRoomEntity record);

    int updateByPrimaryKeyWithBLOBs(HotelRoomEntity record);

    int updateByPrimaryKey(HotelRoomEntity record);

}
