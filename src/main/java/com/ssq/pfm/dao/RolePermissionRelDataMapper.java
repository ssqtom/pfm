package com.ssq.pfm.dao;

import com.ssq.pfm.model.RolePermissionRelData;

public interface RolePermissionRelDataMapper {
    int insert(RolePermissionRelData record);

    int insertSelective(RolePermissionRelData record);
}