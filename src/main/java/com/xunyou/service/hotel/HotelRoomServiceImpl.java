package com.xunyou.service.hotel;

import com.xunyou.mapper.HotelRoomEntityMapper;
import com.xunyou.model.HotelRoomEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HotelRoomServiceImpl implements HotelRoomService {
    @Autowired
    HotelRoomEntityMapper hotelRoomEntityMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(HotelRoomEntity record) {
       return   hotelRoomEntityMapper.insert(record);
    }

    @Override
    public int insertSelective(HotelRoomEntity record) {
        return 0;
    }

    @Override
    public HotelRoomEntity selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public HotelRoomEntity selectByHotelNo(String hotelNo) {
        return hotelRoomEntityMapper.selectByHotelNo(hotelNo);
    }

    @Override
    public int updateByPrimaryKeySelective(HotelRoomEntity record) {
        record.setUpdateDate(new Date());
        return   hotelRoomEntityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(HotelRoomEntity record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(HotelRoomEntity record) {
        return 0;
    }
}
