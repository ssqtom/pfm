package com.ssq.pfm.dao;

import com.ssq.pfm.model.DebtData;
import tk.mybatis.mapper.common.BaseMapper;

public interface DebtDataMapper extends BaseMapper<DebtData>{
    int deleteByPrimaryKey(Long id);

    int insert(DebtData record);

    int insertSelective(DebtData record);

    DebtData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DebtData record);

    int updateByPrimaryKey(DebtData record);
}