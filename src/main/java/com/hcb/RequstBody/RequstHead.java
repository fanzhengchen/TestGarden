package com.hcb.RequstBody;

/**
 * Created by mark on 16-2-19.
 */
//"head": {
//        "user_uuid": "26b17225b626fb9238849fd60eabdf60",
//        "password": "26b17225b626fb9238849fd60eabdf60"
//    },
public class RequstHead {
    private String userUid;
    private String password;

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
