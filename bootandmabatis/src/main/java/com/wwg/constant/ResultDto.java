package com.wwg.constant;

/**
 * Created by wwg on 2017/9/19.
 */
public class ResultDto {

    private Integer code;
    private String message;
    private Object data;

    public static ResultDto toSuccess(String msg){
        ResultDto dto = new ResultDto();
        dto.setCode(0);
        dto.setMessage(msg);
        return dto;
    }

    public static ResultDto toSuccess(Object data){
        ResultDto dto = new ResultDto();
        dto.setCode(0);
        dto.setData(data);
        return dto;
    }

    public static ResultDto toError(String msg){
        ResultDto dto = new ResultDto();
        dto.setCode(1);
        dto.setMessage(msg);
        return dto;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
