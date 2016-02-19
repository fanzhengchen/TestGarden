package com.hcb.response;

/**
 * Created by mark on 16-2-19.
 */
//  "result":"0",
//        "description":"发送成功",
public class BaseBody {
    private String result;
    private String description;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
