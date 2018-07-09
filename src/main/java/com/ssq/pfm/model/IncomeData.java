package com.ssq.pfm.model;

import java.util.Date;

public class IncomeData {
    /**
     * 主键
     */
    private Long id;

    /**
     * 收入人ID
     */
    private Long incomeUserId;

    /**
     * 收入类型 0:固定收入 1:额外收入
     */
    private String incomeType;

    /**
     * 收入金额（元）
     */
    private Double incomeTotal;

    /**
     * 收入日期
     */
    private Date incomeDate;

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
     * 收入人ID
     * @return INCOME_USER_ID 收入人ID
     */
    public Long getIncomeUserId() {
        return incomeUserId;
    }

    /**
     * 收入人ID
     * @param incomeUserId 收入人ID
     */
    public void setIncomeUserId(Long incomeUserId) {
        this.incomeUserId = incomeUserId;
    }

    /**
     * 收入类型 0:固定收入 1:额外收入
     * @return INCOME_TYPE 收入类型 0:固定收入 1:额外收入
     */
    public String getIncomeType() {
        return incomeType;
    }

    /**
     * 收入类型 0:固定收入 1:额外收入
     * @param incomeType 收入类型 0:固定收入 1:额外收入
     */
    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    /**
     * 收入金额（元）
     * @return INCOME_TOTAL 收入金额（元）
     */
    public Double getIncomeTotal() {
        return incomeTotal;
    }

    /**
     * 收入金额（元）
     * @param incomeTotal 收入金额（元）
     */
    public void setIncomeTotal(Double incomeTotal) {
        this.incomeTotal = incomeTotal;
    }

    /**
     * 收入日期
     * @return INCOME_DATE 收入日期
     */
    public Date getIncomeDate() {
        return incomeDate;
    }

    /**
     * 收入日期
     * @param incomeDate 收入日期
     */
    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
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