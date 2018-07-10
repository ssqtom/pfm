package com.ssq.pfm.dao;

import com.ssq.pfm.model.UserData;
import com.ssq.pfm.model.UserDataKey;
import tk.mybatis.mapper.common.BaseMapper;

public interface UserDataMapper extends BaseMapper<UserData> {
    int deleteByPrimaryKey(UserDataKey key);

    int insert(UserData record);

    int insertSelective(UserData record);

    UserData selectByPrimaryKey(UserDataKey key);

    int updateByPrimaryKeySelective(UserData record);

    int updateByPrimaryKey(UserData record);
}