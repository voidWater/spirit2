package voidshell.spirit.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import voidshell.spirit.common.ResultBody;

import java.util.Date;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value =BizException.class)
    @ResponseBody
    public ResultBody bizExceptionHandler(BizException e){
        log.error(e.toString());
        e.printStackTrace();
        return ResultBody.SUCCESS("200","211",new Date());
    }

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public String exceptionHandler(Exception e){
        log.error(e.toString());
        e.printStackTrace();
        return "123error";
    }
}
