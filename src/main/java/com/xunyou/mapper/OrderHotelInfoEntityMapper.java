package com.xunyou.mapper;

import com.xunyou.model.OrderHotelInfoEntity;

public interface OrderHotelInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderHotelInfoEntity record);

    int insertSelective(OrderHotelInfoEntity record);

    OrderHotelInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderHotelInfoEntity record);

    int updateByPrimaryKey(OrderHotelInfoEntity record);
}