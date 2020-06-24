package voidshell.spirit.common;

import voidshell.spirit.exception.ErrorEnum;

public class ResultBody<T> {
    private String code;
    private String msg;
    private T data;

    public static ResultBody SUCCESS(String code,String msg){
        return new ResultBody(code,msg,null);
    }
    public static ResultBody SUCCESS(String code,String msg,Object data){
        return new ResultBody(code,msg,data);
    }
    public static ResultBody feedback(String code,String msg){
        return new ResultBody(code,msg,null);
    }
    public static ResultBody Fail(ErrorEnum error){
        return new ResultBody(error.getResultCode(),error.getResultMsg(),null);
    }

    ResultBody(){}
    ResultBody(String code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
