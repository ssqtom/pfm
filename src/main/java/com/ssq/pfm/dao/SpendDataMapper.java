package com.ssq.pfm.dao;

import com.ssq.pfm.model.SpendData;

public interface SpendDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpendData record);

    int insertSelective(SpendData record);

    SpendData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SpendData record);

    int updateByPrimaryKey(SpendData record);
}