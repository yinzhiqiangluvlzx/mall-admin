package com.bjtu.mall.common.api;

/**
 * 封装API的错误码
 *
 * @author yinzhiqiang
 * @date 2020/7/5 16:32
 */
public interface IErrorCode {
    /**
     * @return 错误码
     */
    long getCode();

    /**
     * @return 错误信息
     */
    String getMessage();
}
