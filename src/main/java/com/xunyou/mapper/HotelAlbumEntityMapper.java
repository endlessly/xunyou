package com.xunyou.mapper;

import com.xunyou.model.HotelAlbumEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelAlbumEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelAlbumEntity record);

    int insertSelective(HotelAlbumEntity record);

    HotelAlbumEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelAlbumEntity record);

    int updateByPrimaryKey(HotelAlbumEntity record);

    int insertList(List<HotelAlbumEntity> hotelAlbumEntityList);
}