package com.xunyou.mapper;

import com.xunyou.model.HotelAlbumEntity;

public interface HotelAlbumEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelAlbumEntity record);

    int insertSelective(HotelAlbumEntity record);

    HotelAlbumEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelAlbumEntity record);

    int updateByPrimaryKey(HotelAlbumEntity record);
}