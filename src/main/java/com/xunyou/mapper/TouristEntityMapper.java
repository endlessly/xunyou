package com.xunyou.mapper;

import com.xunyou.model.TouristEntity;

public interface TouristEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TouristEntity record);

    int insertSelective(TouristEntity record);

    TouristEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TouristEntity record);

    int updateByPrimaryKeyWithBLOBs(TouristEntity record);

    int updateByPrimaryKey(TouristEntity record);
}