package com.xunyou.mapper;

import com.xunyou.model.CollectioRecordEntity;

public interface CollectioRecordEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CollectioRecordEntity record);

    int insertSelective(CollectioRecordEntity record);
}