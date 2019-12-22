package com.jeffryProject.error;
//包装器异常类实现
public class CommonException extends Exception implements CommonError{
    private CommonError commonError;

    //直接接收参数构建业务异常
    public CommonException(CommonError commonError){
        super();
        this.commonError = commonError;
    }
    //自定义业务异常
    public CommonException(CommonError commonError,String errMsg){
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }
    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }

}
