package com.xunyou.mapper;

import com.xunyou.model.GuideCommentEntity;

public interface GuideCommentEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GuideCommentEntity record);

    int insertSelective(GuideCommentEntity record);

    GuideCommentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GuideCommentEntity record);

    int updateByPrimaryKey(GuideCommentEntity record);
}