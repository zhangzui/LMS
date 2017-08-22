package com.traveloka.creditUser.api.vo.user;

import com.traveloka.creditUser.api.vo.BaseResVo;

/**
 * Created by zk on 12/10/15.
 */
public class CreateBaseUserResVo extends BaseResVo {

    private static final long serialVersionUID = 1481186049479899442L;


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
     * 京东pin
     */
    private String jdPin;

    /**
     * 姓名
     */
    private String realName;
    /**
     * 手机号
     */
    private String mobile;

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

    public String getJdPin() {
        return jdPin;
    }

    public void setJdPin(String jdPin) {
        this.jdPin = jdPin;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
