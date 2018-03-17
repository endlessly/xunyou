package com.xunyou.service.hotel;

import com.xunyou.mapper.HotelAlbumEntityMapper;
import com.xunyou.model.HotelAlbumEntity;
import com.xunyou.model.HotelCommentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelAlbumServiceImpl implements HotelAlbumService {

    @Autowired
    HotelAlbumEntityMapper hotelAlbumEntityMapper;

    @Override
    public HotelCommentEntity selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(HotelCommentEntity record) {
        return 0;
    }

    @Override
    public int insertList(List<HotelAlbumEntity> hotelAlbumEntityList) {
        return hotelAlbumEntityMapper.insertList(hotelAlbumEntityList);
    }

    @Override
    public int insertSelective(HotelCommentEntity record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(HotelCommentEntity record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(HotelCommentEntity record) {
        return 0;
    }
}
