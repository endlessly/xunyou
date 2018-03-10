package com.xunyou.mapper;

import com.xunyou.model.OrderGuideInfoEntity;

public interface OrderGuideInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderGuideInfoEntity record);

    int insertSelective(OrderGuideInfoEntity record);

    OrderGuideInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderGuideInfoEntity record);

    int updateByPrimaryKey(OrderGuideInfoEntity record);
}