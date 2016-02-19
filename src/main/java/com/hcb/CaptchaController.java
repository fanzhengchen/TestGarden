package com.hcb;

import com.hcb.response.CaptchaBody;
import com.hcb.response.Head;
import com.hcb.response.Result;
import com.hcb.util.RandomUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mark on 16-2-19.
 */
@RestController
public class CaptchaController {

    private static final Logger LOG = LoggerFactory.getLogger(CaptchaController.class);

    @RequestMapping(value = "/user_login/sms_captcha/{phone}",
            method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Result getCaptcha(@PathVariable String phone) {
        LOG.debug("phone {}", phone);
        Result<CaptchaBody> result = new Result();
        Head head = new Head();
        CaptchaBody body = new CaptchaBody();

        head.setReturnCode("000");
        head.setReturnDescription("send your captcha");

        body.setCode(RandomUtil.captcha());
        body.setResult("0");
        body.setDescription("send captha ");

        result.setHead(head);
        result.setBody(body);

        return result;
    }
}
