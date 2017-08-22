package com.traveloka.creditUser.api.vo;

import java.io.Serializable;

/**
 * @author zhangkai9
 * @date 2015/8/4
 */
public class BaseReqVo implements Serializable {
    /**
     * 调用方 标识 ，唯一。
     */
    private String appCode;

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
}
