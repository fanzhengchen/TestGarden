package com.hcb.RequstBody;

/**
 * Created by mark on 16-2-19.
 */
public class MyRequst<Body extends MyRequestBody> {

    private RequstHead requstHead;
    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
