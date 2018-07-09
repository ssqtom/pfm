package com.ssq.pfm.model;

import java.util.Date;

public class DepositData {
    /**
     * 
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long depositUserId;

    /**
     * 余额
     */
    private Double depositTotal;

    /**
     * 插入时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 
     * @return ID 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户ID
     * @return DEPOSIT_USER_ID 用户ID
     */
    public Long getDepositUserId() {
        return depositUserId;
    }

    /**
     * 用户ID
     * @param depositUserId 用户ID
     */
    public void setDepositUserId(Long depositUserId) {
        this.depositUserId = depositUserId;
    }

    /**
     * 余额
     * @return DEPOSIT_TOTAL 余额
     */
    public Double getDepositTotal() {
        return depositTotal;
    }

    /**
     * 余额
     * @param depositTotal 余额
     */
    public void setDepositTotal(Double depositTotal) {
        this.depositTotal = depositTotal;
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