package com.ssq.pfm.model;

import java.util.Date;

public class UserData extends UserDataKey {
    /**
     * 用户年龄
     */
    private Integer userAge;

    /**
     * 用户性别 0:男 1:女
     */
    private String userSex;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户手机
     */
    private String userPhone;

    /**
     * 用户登录名
     */
    private String userLoginName;

    /**
     * 用户登录密码
     */
    private String userLoginPwd;

    /**
     * 插入时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 用户年龄
     * @return USER_AGE 用户年龄
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * 用户年龄
     * @param userAge 用户年龄
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * 用户性别 0:男 1:女
     * @return USER_SEX 用户性别 0:男 1:女
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 用户性别 0:男 1:女
     * @param userSex 用户性别 0:男 1:女
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 用户邮箱
     * @return USER_EMAIL 用户邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 用户邮箱
     * @param userEmail 用户邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 用户手机
     * @return USER_PHONE 用户手机
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 用户手机
     * @param userPhone 用户手机
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 用户登录名
     * @return USER_LOGIN_NAME 用户登录名
     */
    public String getUserLoginName() {
        return userLoginName;
    }

    /**
     * 用户登录名
     * @param userLoginName 用户登录名
     */
    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    /**
     * 用户登录密码
     * @return USER_LOGIN_PWD 用户登录密码
     */
    public String getUserLoginPwd() {
        return userLoginPwd;
    }

    /**
     * 用户登录密码
     * @param userLoginPwd 用户登录密码
     */
    public void setUserLoginPwd(String userLoginPwd) {
        this.userLoginPwd = userLoginPwd;
    }

    /**
     * 插入时间
     * @return CREATE_TIME 插入时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 插入时间
     * @param createTime 插入时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return UPDATE_TIME 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}