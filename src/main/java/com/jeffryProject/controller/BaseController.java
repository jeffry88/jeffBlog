package com.jeffryProject.controller;

import com.jeffryProject.error.CommonException;
import com.jeffryProject.error.EmCommError;
import com.jeffryProject.response.CommonReturnType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";

    //定义exceptionHandle解决未被controller层吸收的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(HttpServletRequest request, Exception ex) {
        Map<String, Object> responseData = new HashMap<>();
        if (ex instanceof CommonException) {
            CommonException commonException = (CommonException)ex;
            responseData.put("errCode",commonException.getErrCode());
            responseData.put("errMsg",commonException.getErrMsg());
        } else {
            String errName = ex.getCause().getClass().getName();
            responseData.put("errCode", EmCommError.UNKNOWN_ERROR.getErrCode());
            responseData.put("errName", errName);
            responseData.put("errMsg", ex.getCause().getMessage());
        }
        return CommonReturnType.create(responseData,"fail",4000);
    }
}
