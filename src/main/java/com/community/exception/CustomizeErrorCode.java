package com.community.exception;

public enum  CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND(2001,"\"你找的问题被小僻菇吃掉了\""),
    TARGET_PARAM_NOT_FOUND(2002,"\"未选中任何问题或评论进行回复\""),
    NO_LOGIN(2003,"\"请登录后再进行当前操作\"");

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code,String message){
        this.message = message;
        this.code = code;
    }

}
