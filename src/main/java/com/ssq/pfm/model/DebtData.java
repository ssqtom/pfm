package com.ssq.pfm.model;

import java.util.Date;

public class DebtData {
    /**
     * 主键
     */
    private Long id;

    /**
     * 负债人ID
     */
    private Long debtUserId;

    /**
     * 负债类型 0:房贷 1:信用卡 2:支付宝 3:京东 4:借债 5:其他
     */
    private String debtType;

    /**
     * 总负债金额
     */
    private Double debtTotalAmount;

    /**
     * 负债总期数
     */
    private Integer debtTotalMonth;

    /**
     * 已还金额
     */
    private Double debtPayAmount;

    /**
     * 已还期数
     */
    private Integer debtPayMonth;

    /**
     * 每月最迟还款日期
     */
    private Integer debtPayDate;

    /**
     * 剩余期数
     */
    private Integer debtSurplusMonth;

    /**
     * 剩余金额
     */
    private Double debtSurplusAmount;

    /**
     * 每期应还金额
     */
    private Double debtEveryAmount;

    /**
     * 最低每月应还
     */
    private Double debtLowAmount;

    /**
     * 插入日期
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
     * 负债人ID
     * @return DEBT_USER_ID 负债人ID
     */
    public Long getDebtUserId() {
        return debtUserId;
    }

    /**
     * 负债人ID
     * @param debtUserId 负债人ID
     */
    public void setDebtUserId(Long debtUserId) {
        this.debtUserId = debtUserId;
    }

    /**
     * 负债类型 0:房贷 1:信用卡 2:支付宝 3:京东 4:借债 5:其他
     * @return DEBT_TYPE 负债类型 0:房贷 1:信用卡 2:支付宝 3:京东 4:借债 5:其他
     */
    public String getDebtType() {
        return debtType;
    }

    /**
     * 负债类型 0:房贷 1:信用卡 2:支付宝 3:京东 4:借债 5:其他
     * @param debtType 负债类型 0:房贷 1:信用卡 2:支付宝 3:京东 4:借债 5:其他
     */
    public void setDebtType(String debtType) {
        this.debtType = debtType;
    }

    /**
     * 总负债金额
     * @return DEBT_TOTAL_AMOUNT 总负债金额
     */
    public Double getDebtTotalAmount() {
        return debtTotalAmount;
    }

    /**
     * 总负债金额
     * @param debtTotalAmount 总负债金额
     */
    public void setDebtTotalAmount(Double debtTotalAmount) {
        this.debtTotalAmount = debtTotalAmount;
    }

    /**
     * 负债总期数
     * @return DEBT_TOTAL_MONTH 负债总期数
     */
    public Integer getDebtTotalMonth() {
        return debtTotalMonth;
    }

    /**
     * 负债总期数
     * @param debtTotalMonth 负债总期数
     */
    public void setDebtTotalMonth(Integer debtTotalMonth) {
        this.debtTotalMonth = debtTotalMonth;
    }

    /**
     * 已还金额
     * @return DEBT_PAY_AMOUNT 已还金额
     */
    public Double getDebtPayAmount() {
        return debtPayAmount;
    }

    /**
     * 已还金额
     * @param debtPayAmount 已还金额
     */
    public void setDebtPayAmount(Double debtPayAmount) {
        this.debtPayAmount = debtPayAmount;
    }

    /**
     * 已还期数
     * @return DEBT_PAY_MONTH 已还期数
     */
    public Integer getDebtPayMonth() {
        return debtPayMonth;
    }

    /**
     * 已还期数
     * @param debtPayMonth 已还期数
     */
    public void setDebtPayMonth(Integer debtPayMonth) {
        this.debtPayMonth = debtPayMonth;
    }

    /**
     * 每月最迟还款日期
     * @return DEBT_PAY_DATE 每月最迟还款日期
     */
    public Integer getDebtPayDate() {
        return debtPayDate;
    }

    /**
     * 每月最迟还款日期
     * @param debtPayDate 每月最迟还款日期
     */
    public void setDebtPayDate(Integer debtPayDate) {
        this.debtPayDate = debtPayDate;
    }

    /**
     * 剩余期数
     * @return DEBT_SURPLUS_MONTH 剩余期数
     */
    public Integer getDebtSurplusMonth() {
        return debtSurplusMonth;
    }

    /**
     * 剩余期数
     * @param debtSurplusMonth 剩余期数
     */
    public void setDebtSurplusMonth(Integer debtSurplusMonth) {
        this.debtSurplusMonth = debtSurplusMonth;
    }

    /**
     * 剩余金额
     * @return DEBT_SURPLUS_AMOUNT 剩余金额
     */
    public Double getDebtSurplusAmount() {
        return debtSurplusAmount;
    }

    /**
     * 剩余金额
     * @param debtSurplusAmount 剩余金额
     */
    public void setDebtSurplusAmount(Double debtSurplusAmount) {
        this.debtSurplusAmount = debtSurplusAmount;
    }

    /**
     * 每期应还金额
     * @return DEBT_EVERY_AMOUNT 每期应还金额
     */
    public Double getDebtEveryAmount() {
        return debtEveryAmount;
    }

    /**
     * 每期应还金额
     * @param debtEveryAmount 每期应还金额
     */
    public void setDebtEveryAmount(Double debtEveryAmount) {
        this.debtEveryAmount = debtEveryAmount;
    }

    /**
     * 最低每月应还
     * @return DEBT_LOW_AMOUNT 最低每月应还
     */
    public Double getDebtLowAmount() {
        return debtLowAmount;
    }

    /**
     * 最低每月应还
     * @param debtLowAmount 最低每月应还
     */
    public void setDebtLowAmount(Double debtLowAmount) {
        this.debtLowAmount = debtLowAmount;
    }

    /**
     * 插入日期
     * @return CREATE_TIME 插入日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 插入日期
     * @param createTime 插入日期
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