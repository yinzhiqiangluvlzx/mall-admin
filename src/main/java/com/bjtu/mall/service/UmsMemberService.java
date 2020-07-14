package com.bjtu.mall.service;

import com.bjtu.mall.common.api.CommonResult;

/**
 * 会员管理Service
 *
 * @author yinzhiqiang
 * @date 2020/7/14 22:31
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     *
     * @param telephone 手机号
     * @return CommonResult
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     *
     * @param telephone 手机号
     * @param authCode  验证码
     * @return CommonResult
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
