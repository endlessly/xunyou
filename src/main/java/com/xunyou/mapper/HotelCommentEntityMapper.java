package com.xunyou.mapper;

import com.xunyou.model.HotelAlbumEntity;
import com.xunyou.model.HotelCommentEntity;

import java.util.List;

public interface HotelCommentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelCommentEntity record);

    int insertSelective(HotelCommentEntity record);

    HotelCommentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelCommentEntity record);

    int updateByPrimaryKey(HotelCommentEntity record);
    int insertList(List<HotelAlbumEntity> hotelAlbumEntityList);
}