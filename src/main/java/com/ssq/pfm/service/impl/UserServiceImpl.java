package com.ssq.pfm.service.impl;

import com.ssq.pfm.dao.UserDataMapper;
import com.ssq.pfm.model.UserData;
import com.ssq.pfm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: <br/>
 * Function: <br/>
 * date: 2018/7/9 下午11:24<br/>
 *
 * @author sushiqi<br />
 * @since JDK 1.8
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDataMapper userDataMapper;
    @Override
    public UserData getUser(String userName) {
        UserData userData = new UserData();
        userData.setUserLoginName(userName);
        return userDataMapper.selectOne(userData);
    }
}
