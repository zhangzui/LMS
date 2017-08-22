package com.traveloka.creditUser.api;

import com.traveloka.creditUser.api.vo.user.*;

/**
 * Created by zhangzuizui on 2015/2/12.
 */
public interface UserRegisterResource {

    /**
     * 验证用户信息是否已注册
     * @param checkRegisterReqVo
     * @return
     */
    public CheckRegisterResVo checkRegister(CheckRegisterReqVo checkRegisterReqVo);

    public UserRegisterResVo commLoopUserRegister(CommLoopRegisterReqVo userRegisterReqVo);

    /**
     * 创建基本用户信息。
     * 唯一键限制：手机号，身份证号，platPin
     *
     * 新增用户，如果因为身份证号导致插入失败，则认为是成功。否则是异常
     * 如果发生身份证件主键冲突，则尝试更新jdpin。
     * @param createBaseUserReqVo
     * @return
     */
    public CreateBaseUserResVo createBaseUser(CreateBaseUserReqVo createBaseUserReqVo);

}
