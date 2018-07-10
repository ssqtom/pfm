package com.ssq.pfm.dao;

import com.ssq.pfm.model.UserRoleRelData;

public interface UserRoleRelDataMapper {
    int insert(UserRoleRelData record);

    int insertSelective(UserRoleRelData record);
}