package com.hcb.controller;

import com.hcb.RequstBody.LoginReqeustBody;
import com.hcb.RequstBody.MyRequst;
import com.hcb.UserInfo;
import com.hcb.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mark on 16-2-19.
 */
@RestController
public class LoginController {

    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user_login/login/{phone}",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public void login(@PathVariable String phone, @RequestBody MyRequst<LoginReqeustBody> request) {
        LOG.debug("phone {} request {}", phone, request);
        LoginReqeustBody body = request.getBody();

    }

    private boolean isUserExist(String phone) {
        UserInfo userInfo;
        try {
            userInfo = userDao.findByPhone(phone);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
