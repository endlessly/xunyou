package com.xunyou.service.hotel;

import com.xunyou.model.HotelEntity;

import java.util.List;

public interface HotelService {

    public int addHotel(HotelEntity record);
    public boolean delHotel();
    public List<HotelEntity> queryHotel();
    public HotelEntity updateHotel();

}
