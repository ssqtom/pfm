package com.ssq.pfm.model;

public class UserDataKey {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户姓名
     */
    private String userFullName;

    /**
     * 主键
     * @return ID 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户姓名
     * @return USER_FULL_NAME 用户姓名
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * 用户姓名
     * @param userFullName 用户姓名
     */
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }
}