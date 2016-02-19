package com.hcb.response;

import com.hcb.util.MyTimeUtil;

/**
 * Created by mark on 16-2-19.
 */
//"returnCode":"000",
//        "returnDescription":"%E9%80%9A%E8%BF%87%E6%A0%A1%E9%AA%8C",
//        "sysTime":"2016-02-19 16:51:32"
public class Head {
    private String returnCode;
    private String returnDescription;
    private String sysTime;

    public Head(){
        this.sysTime = MyTimeUtil.getCurrentTime();
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnDescription() {
        return returnDescription;
    }

    public void setReturnDescription(String returnDescription) {
        this.returnDescription = returnDescription;
    }

    public String getSysTime() {
        return sysTime;
    }

    public void setSysTime(String sysTime) {
        this.sysTime = sysTime;
    }
}
