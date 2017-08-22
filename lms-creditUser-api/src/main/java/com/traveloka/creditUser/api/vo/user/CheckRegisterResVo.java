package com.traveloka.creditUser.api.vo.user;

import com.traveloka.creditUser.api.vo.BaseResVo;

import java.math.BigDecimal;

/**
 *<p>验证用户信息是否注册返回参数</p>
 * User: minxiangfei
 * Date: 14-9-10
 * Time: 下午1:59
 */
public class CheckRegisterResVo extends BaseResVo {

    private static final long serialVersionUID = -1482186049479899442L;


    /**
     * 用户状态：正常：1，止付：0，失效：2
     */
    private String status;

    /**
     * 旅游白条首次申请标识是否第一次创建账户：1：未注册（第一次），0，已注册（一次以上）,1：是；0：否
     */
    private String ly_baitiao_first_apply_flag;

    /**
     * 平台pin
     */
    private String platPin;

    /**
     * 京东pin
     */
    private String jdPin;

    /**
     * 身份证号
     */
    private String idNo;

    /**
     * 旅游白条授信额度
     */
    private BigDecimal creditBalance;

    /**
     * 剩余旅游白条额度
     */
    private BigDecimal limitBalance;

    /**
     * 电话
     */
    private String mobile;

    /**
     *信用失效时间
     */
    private String expiryDate;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 别名
     */
    private String nickName;

    /*
    **金融平台当前是否存在逾期产品
     */
    private String platform_current_overdue_flag;

//  是否京东白条用户
    private String jd_baitiao_flag;
//  京东白条账户状态
    private String jd_baitiao_account_status;
//  京东白条账户止付状态
    private String jd_baitiao_account_stop_flag;

    public String getPlatPin() {
        return platPin;
    }

    public void setPlatPin(String platPin) {
        this.platPin = platPin;
    }

    public String getJdPin() {
        return jdPin;
    }

    public void setJdPin(String jdPin) {
        this.jdPin = jdPin;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public BigDecimal getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(BigDecimal creditBalance) {
        this.creditBalance = creditBalance;
    }

    public BigDecimal getLimitBalance() {
        return limitBalance;
    }

    public void setLimitBalance(BigDecimal limitBalance) {
        this.limitBalance = limitBalance;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLy_baitiao_first_apply_flag() {
        return ly_baitiao_first_apply_flag;
    }

    public void setLy_baitiao_first_apply_flag(String ly_baitiao_first_apply_flag) {
        this.ly_baitiao_first_apply_flag = ly_baitiao_first_apply_flag;
    }

    public String getPlatform_current_overdue_flag() {
        return platform_current_overdue_flag;
    }

    public void setPlatform_current_overdue_flag(String platform_current_overdue_flag) {
        this.platform_current_overdue_flag = platform_current_overdue_flag;
    }

    public String getJd_baitiao_flag() {
        return jd_baitiao_flag;
    }

    public void setJd_baitiao_flag(String jd_baitiao_flag) {
        this.jd_baitiao_flag = jd_baitiao_flag;
    }

    public String getJd_baitiao_account_status() {
        return jd_baitiao_account_status;
    }

    public void setJd_baitiao_account_status(String jd_baitiao_account_status) {
        this.jd_baitiao_account_status = jd_baitiao_account_status;
    }

    public String getJd_baitiao_account_stop_flag() {
        return jd_baitiao_account_stop_flag;
    }

    public void setJd_baitiao_account_stop_flag(String jd_baitiao_account_stop_flag) {
        this.jd_baitiao_account_stop_flag = jd_baitiao_account_stop_flag;
    }
}
