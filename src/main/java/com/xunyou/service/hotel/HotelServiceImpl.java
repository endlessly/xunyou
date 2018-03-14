package com.xunyou.service.hotel;

import com.xunyou.mapper.HotelEntityMapper;
import com.xunyou.model.HotelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelEntityMapper hotelEntityMapper;

    @Override
    public int addHotel(HotelEntity record) {
        record.setUpdateDate(new Date());
        record.setCreateDate(new Date());
        record.setHotelNo("D001");
        record.setHasRoom(false);
        record.setStatus(true);
        record.setOpenEndTime(new Date());
        record.setOpenStartTime(new Date());

        int result = hotelEntityMapper.insert(record);
        if (result == 0) return 0;

        return result;
    }

    @Override
    public boolean delHotel() {
        return false;
    }

    @Override
    public List<HotelEntity> queryHotel() {
        return null;
    }

    @Override
    public HotelEntity updateHotel() {
        return null;
    }
}
