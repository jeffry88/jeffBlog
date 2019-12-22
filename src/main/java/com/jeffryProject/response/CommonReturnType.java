package com.jeffryProject.response;

public class CommonReturnType {
    //返回结果的状态：success/fail
    private String status;
    //返回的状态码
    private Integer code;

    //若status=success ，则data内返回正确的json格式数据
    //若fail返回错误码
    private Object data;
    //定义一个通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result ,"success",2000);
    }

    public static CommonReturnType create(Object result,String status,Integer code) {
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        type.setCode(code);
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode(){ return code;}

    public void setCode(Integer code){ this.code = code; }
}
