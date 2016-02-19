package com.hcb.response;

import com.hcb.util.MyTimeUtil;

/**
 * Created by mark on 16-2-19.
 */
public class Result<Body extends BaseBody> {
    private Head head;
    private Body body;

    public Result(){
        this.head = new Head();
        head.setSysTime(MyTimeUtil.getCurrentTime());
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
