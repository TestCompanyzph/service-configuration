package com.zph.usedCar.configuration;

import com.zph.usedCar.common.exception.BusinessException;
import com.zph.usedCar.common.response.Response;
import com.zph.usedCar.common.response.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @notes 全局异常统一处理类
 * @autho zph
 * @createTime 2017/11/16 20:23
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public Response businessExceptionHandler(BusinessException e) throws Exception {
        Response response = new Response();
        response.setMessage(e.getMessage());
        response.setCode(ResultCode.RESULT_SUCCESS.getCode());
        return response;
    }
}
