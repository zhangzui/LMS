package com.traveloka.creditUser.api.vo.user;

import com.traveloka.creditUser.api.vo.BaseReqVo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CommLoopRegisterReqVo extends BaseReqVo implements Serializable {

    private static final long serialVersionUID = -1218214287537002942L;

    /**
     * SFY,SFD,XFD,BIZCD,ZF,NORMAL,OFFLINE
     */
    private String bizType;

    private String orderId;
    /**
     * 商户号
     */
    private String merchantCode;

    /**
     * 证件类型
     */
    private String idType;

    /**
     * 证件号
     */
    private String idNo;

    //  京东pin
    private String jdPin;

    private String name;
    /**
     * 手机号
     */
    private String mobile;

    /**
     * 授信额度
     */
    private BigDecimal creditBalance;

    private String platPin;
    /**
     *  商家用户id
     */
    private String merchantUserId;

     /**
     *  银行卡号
     */
    private String cardNo;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPlatPin() {
        return platPin;
    }

    public void setPlatPin(String platPin) {
        this.platPin = platPin;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJdPin() {
        return jdPin;
    }

    public void setJdPin(String jdPin) {
        this.jdPin = jdPin;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BigDecimal getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(BigDecimal creditBalance) {
        this.creditBalance = creditBalance;
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
    }
}
