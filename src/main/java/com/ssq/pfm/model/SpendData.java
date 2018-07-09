package com.ssq.pfm.model;

import java.util.Date;

public class SpendData {
    /**
     * 主键
     */
    private Long id;

    /**
     * 支出人ID
     */
    private Long spendUserId;

    /**
     * 支出类型 0:固定支出 1:额外支出
     */
    private String spendType;

    /**
     * 支出金额（元）
     */
    private Double spendTotal;

    /**
     * 支出日期
     */
    private Date spendDate;

    /**
     * 插入时间
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
     * 支出人ID
     * @return SPEND_USER_ID 支出人ID
     */
    public Long getSpendUserId() {
        return spendUserId;
    }

    /**
     * 支出人ID
     * @param spendUserId 支出人ID
     */
    public void setSpendUserId(Long spendUserId) {
        this.spendUserId = spendUserId;
    }

    /**
     * 支出类型 0:固定支出 1:额外支出
     * @return SPEND_TYPE 支出类型 0:固定支出 1:额外支出
     */
    public String getSpendType() {
        return spendType;
    }

    /**
     * 支出类型 0:固定支出 1:额外支出
     * @param spendType 支出类型 0:固定支出 1:额外支出
     */
    public void setSpendType(String spendType) {
        this.spendType = spendType;
    }

    /**
     * 支出金额（元）
     * @return SPEND_TOTAL 支出金额（元）
     */
    public Double getSpendTotal() {
        return spendTotal;
    }

    /**
     * 支出金额（元）
     * @param spendTotal 支出金额（元）
     */
    public void setSpendTotal(Double spendTotal) {
        this.spendTotal = spendTotal;
    }

    /**
     * 支出日期
     * @return SPEND_DATE 支出日期
     */
    public Date getSpendDate() {
        return spendDate;
    }

    /**
     * 支出日期
     * @param spendDate 支出日期
     */
    public void setSpendDate(Date spendDate) {
        this.spendDate = spendDate;
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