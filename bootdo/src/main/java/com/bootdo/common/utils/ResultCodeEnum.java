package com.bootdo.common.utils;

/**
 * 返回结果code码
 * <p>
 *
 * @author ：陈冕
 * @version : 1.0.0
 * @date : 2018/8/17
 */
public enum ResultCodeEnum {
    OK(200, "执行成功！"),
    SYSTEM_EXCEPTION(5000, "系统异常！"),
    BAD_REQUEST_PARAMS(10001, "缺少必要的请求参数！"),
    BAD_REQUEST_MEDIA_TYPE(10002, "HTTP Headers MediaType 错误！"),
    PARAM_BIND_EXCEPTION(10003, "参数绑定异常，请检查表单填写的数据！"),
    PARSE_JSON_EXCEPTION(10004, " JSON转化异常！");

    private int code;
    private String message;

    private ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }
}