package com.ssq.pfm.model;

import java.util.Date;

public class PermissionData {
    /**
     * 主键
     */
    private Long id;

    /**
     * url地址
     */
    private String perUrl;

    /**
     * URL描述
     */
    private String perName;

    /**
     * 排序值
     */
    private Integer perSort;

    /**
     * 
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

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
     * url地址
     * @return PER_URL url地址
     */
    public String getPerUrl() {
        return perUrl;
    }

    /**
     * url地址
     * @param perUrl url地址
     */
    public void setPerUrl(String perUrl) {
        this.perUrl = perUrl;
    }

    /**
     * URL描述
     * @return PER_NAME URL描述
     */
    public String getPerName() {
        return perName;
    }

    /**
     * URL描述
     * @param perName URL描述
     */
    public void setPerName(String perName) {
        this.perName = perName;
    }

    /**
     * 排序值
     * @return PER_SORT 排序值
     */
    public Integer getPerSort() {
        return perSort;
    }

    /**
     * 排序值
     * @param perSort 排序值
     */
    public void setPerSort(Integer perSort) {
        this.perSort = perSort;
    }

    /**
     * 
     * @return CREATE_TIME 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
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