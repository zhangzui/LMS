package com.traveloka.creditUser.api.vo;

import java.io.Serializable;

/**
 * <p>接口回调父类</p>
 * User: minxiangfei
 * Date: 14-8-5
 * Time: 下午3:20
 */
public class BaseResVo implements Serializable {
    /**
     * 返回码
     * UE0000：成功
     */
    private String resultCode;

    /**
     * 返回状态码描述
     */
    private String resultMsg;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
