package com.ssq.pfm.dao;

import com.ssq.pfm.model.PermissionData;

public interface PermissionDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionData record);

    int insertSelective(PermissionData record);

    PermissionData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionData record);

    int updateByPrimaryKey(PermissionData record);
}