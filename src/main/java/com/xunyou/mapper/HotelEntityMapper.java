package com.xunyou.mapper;

import com.xunyou.model.HotelEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelEntity record);

    int insertSelective(HotelEntity record);

    HotelEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelEntity record);

    int updateByPrimaryKeyWithBLOBs(HotelEntity record);

    int updateByPrimaryKey(HotelEntity record);
}