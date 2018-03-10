package com.xunyou.mapper;

import com.xunyou.model.TouristAlbumEntity;

public interface TouristAlbumEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TouristAlbumEntity record);

    int insertSelective(TouristAlbumEntity record);

    TouristAlbumEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TouristAlbumEntity record);

    int updateByPrimaryKey(TouristAlbumEntity record);
}