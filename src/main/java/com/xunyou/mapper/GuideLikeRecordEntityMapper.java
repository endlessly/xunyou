package com.xunyou.mapper;

import com.xunyou.model.GuideLikeRecordEntity;

public interface GuideLikeRecordEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GuideLikeRecordEntity record);

    int insertSelective(GuideLikeRecordEntity record);

    GuideLikeRecordEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GuideLikeRecordEntity record);

    int updateByPrimaryKey(GuideLikeRecordEntity record);
}