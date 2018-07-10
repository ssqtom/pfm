package com.ssq.pfm.dao;

import com.ssq.pfm.model.RoleData;

public interface RoleDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleData record);

    int insertSelective(RoleData record);

    RoleData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleData record);

    int updateByPrimaryKey(RoleData record);
}