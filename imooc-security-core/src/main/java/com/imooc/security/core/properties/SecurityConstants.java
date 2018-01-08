package com.imooc.security.core.properties;

public interface SecurityConstants {

    String DEFAULT_UNAUTHENTICATION_URI = "/authentication/require";

    String DEFAULT_AUTHENTICATION_PROCESSING_URI_FORM = "/authentication/form";

    String DEFAULT_AUTHENTICATION_PROCESSING_URI_MOBILE = "/authentication/mobile";

    String DEFAULT_VALIDATE_CODE_GENERATE_URI_PREFIX = "/code";

    /**
     * 验证图片验证码时，http请求中默认的携带图片验证码信息的参数的名称
     */
    String DEFAULT_PARAMETER_NAME_CODE_IMAGE = "imageCode";
    /**
     * 验证短信验证码时，http请求中默认的携带短信验证码信息的参数的名称
     */
    String DEFAULT_PARAMETER_NAME_CODE_SMS = "smsCode";
    /**
     * 发送短信验证码 或 验证短信验证码时，传递手机号的参数的名称
     */
    String DEFAULT_PARAMETER_NAME_MOBILE = "mobile";
}
