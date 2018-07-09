package com.ssq.pfm.dao;

import com.ssq.pfm.model.UserData;
import com.ssq.pfm.model.UserDataKey;

public interface UserDataMapper {
    int deleteByPrimaryKey(UserDataKey key);

    int insert(UserData record);

    int insertSelective(UserData record);

    UserData selectByPrimaryKey(UserDataKey key);

    int updateByPrimaryKeySelective(UserData record);

    int updateByPrimaryKey(UserData record);
}