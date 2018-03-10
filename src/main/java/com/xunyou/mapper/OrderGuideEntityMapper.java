package com.xunyou.mapper;

import com.xunyou.model.OrderGuideEntity;

public interface OrderGuideEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderGuideEntity record);

    int insertSelective(OrderGuideEntity record);

    OrderGuideEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderGuideEntity record);

    int updateByPrimaryKey(OrderGuideEntity record);
}