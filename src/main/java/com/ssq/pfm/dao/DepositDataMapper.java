package com.ssq.pfm.dao;

import com.ssq.pfm.model.DepositData;

public interface DepositDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DepositData record);

    int insertSelective(DepositData record);

    DepositData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DepositData record);

    int updateByPrimaryKey(DepositData record);
}