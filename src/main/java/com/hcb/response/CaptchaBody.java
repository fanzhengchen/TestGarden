package com.hcb.response;

/**
 * Created by mark on 16-2-19.
 */
public class CaptchaBody extends BaseBody{
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
