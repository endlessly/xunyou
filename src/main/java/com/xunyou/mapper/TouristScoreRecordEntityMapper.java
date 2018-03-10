package com.xunyou.mapper;

import com.xunyou.model.TouristScoreRecordEntity;

public interface TouristScoreRecordEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TouristScoreRecordEntity record);

    int insertSelective(TouristScoreRecordEntity record);

    TouristScoreRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TouristScoreRecordEntity record);

    int updateByPrimaryKey(TouristScoreRecordEntity record);
}