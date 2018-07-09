package com.ssq.pfm.dao;

import com.ssq.pfm.model.DebtData;

public interface DebtDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DebtData record);

    int insertSelective(DebtData record);

    DebtData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DebtData record);

    int updateByPrimaryKey(DebtData record);
}