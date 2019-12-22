package com.jeffryProject.error;

public enum EmCommError implements CommonError  {
    //定义通用错误码00001；
    PARMETER_VALIDATION_ERROR(200001,"参数不合法"),
    UNKNOWN_ERROR(200002,"未知错误"),
    //10000开头为用户信息相关错误定义
    USER_NOT_EXIST(10001,"用户不存在"),
    //登录错误
    USER_LOGIN_FAIL(10002,"用户名或密码错误");
    private int errCode;
    private String errMsg;

    private EmCommError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

}
