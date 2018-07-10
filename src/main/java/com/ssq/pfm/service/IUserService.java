package com.ssq.pfm.service;

import com.ssq.pfm.model.UserData;

/**
 * ClassName: <br/>
 * Function: <br/>
 * date: 2018/7/9 下午11:22<br/>
 *
 * @author sushiqi<br />
 * @since JDK 1.8
 */
public interface IUserService {
    UserData getUser(String userName);
}
