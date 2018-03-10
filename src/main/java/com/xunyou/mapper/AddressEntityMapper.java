package com.xunyou.mapper;

import com.xunyou.model.AddressEntity;

public interface AddressEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AddressEntity record);

    int insertSelective(AddressEntity record);

    AddressEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AddressEntity record);

    int updateByPrimaryKeyWithBLOBs(AddressEntity record);

    int updateByPrimaryKey(AddressEntity record);
}