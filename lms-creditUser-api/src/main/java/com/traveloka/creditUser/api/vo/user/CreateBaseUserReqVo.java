package com.traveloka.creditUser.api.vo.user;

import com.traveloka.creditUser.api.vo.BaseReqVo;

import java.io.Serializable;

/**
 * @author zhangkai9
 * @date 2015/12/10
 */
public class CreateBaseUserReqVo extends BaseReqVo implements Serializable {

    private static final long serialVersionUID = -1218214287537002141L;

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
    /**
     * 激活的来源，两位字符
     * bt-白条的同步，rn-realname 3.0实名。
     */
    private String activeType;


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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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

    public String getActiveType() {
        return activeType;
    }

    public void setActiveType(String activeType) {
        this.activeType = activeType;
    }
}
