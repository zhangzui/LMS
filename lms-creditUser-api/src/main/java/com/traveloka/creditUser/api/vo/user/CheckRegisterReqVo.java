package com.traveloka.creditUser.api.vo.user;

import java.io.Serializable;

/**
 * <p>验证用户是否注册请求参数</p>
 * User: minxiangfei
 * Date: 14-9-10
 * Time: 下午2:00
 */
public class CheckRegisterReqVo implements Serializable {

    private static final long serialVersionUID = -1482186049479899442L;

    /**
     * 用户pin
     */
    private String platPin;

    /**
     * 证件类型
     */
    private String idType;

    /**
     * 证件号
     */
    private String idNo;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 第三方用户标识
     */
    private String refpin;

    /**
     * 第三方商户号
     */
    private String refMerchant;

    /**
     *商家接入方式
     */
    private String merchant_interface_type;

    /**
     * 出资方商户号
     */
    private String investment;

    /**
     * 账户的总数
     */
    private int accountsCount;

    /**
     *
     * 订单号
     */
    private String orderId;
//  商户id
    private String merchantId;
//  credituser的总数
    private int credituserCount;

    public String getPlatPin() {
        return platPin;
    }

    public void setPlatPin(String platPin) {
        this.platPin = platPin;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRefpin() {
        return refpin;
    }

    public void setRefpin(String refpin) {
        this.refpin = refpin;
    }

    public String getRefMerchant() {
        return refMerchant;
    }

    public void setRefMerchant(String refMerchant) {
        this.refMerchant = refMerchant;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public int getAccountsCount() {
        return accountsCount;
    }

    public void setAccountsCount(int accountsCount) {
        this.accountsCount = accountsCount;
    }

    public String getMerchant_interface_type() {
        return merchant_interface_type;
    }

    public void setMerchant_interface_type(String merchant_interface_type) {
        this.merchant_interface_type = merchant_interface_type;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public int getCredituserCount() {
        return credituserCount;
    }

    public void setCredituserCount(int credituserCount) {
        this.credituserCount = credituserCount;
    }
}
