package com.xunyou.mapper;

import com.xunyou.model.GuideAlbumEntity;

public interface GuideAlbumEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GuideAlbumEntity record);

    int insertSelective(GuideAlbumEntity record);

    GuideAlbumEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GuideAlbumEntity record);

    int updateByPrimaryKey(GuideAlbumEntity record);
}