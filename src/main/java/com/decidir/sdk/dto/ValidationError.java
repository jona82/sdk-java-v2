package com.decidir.sdk.dto;

/**
 * Created by biandra on 06/07/16.
 */
public class ValidationError {

    private String code;
    private String param;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}