package com.ssq.pfm.dao;

import com.ssq.pfm.model.IncomeData;

public interface IncomeDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IncomeData record);

    int insertSelective(IncomeData record);

    IncomeData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IncomeData record);

    int updateByPrimaryKey(IncomeData record);
}