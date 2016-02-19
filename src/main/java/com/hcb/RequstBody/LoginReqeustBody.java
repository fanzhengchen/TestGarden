package com.hcb.RequstBody;

/**
 * Created by mark on 16-2-19.
 */
//   "captcha": "435365",
//        "password": "1234567894"
public class LoginReqeustBody extends MyRequestBody {

    private String captcha;
    private String password;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
