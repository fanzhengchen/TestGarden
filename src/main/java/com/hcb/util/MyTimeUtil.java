package com.hcb.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mark on 16-2-19.
 */
public class MyTimeUtil {

    public static String getCurrentTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd: HH:mm:ss");
        return simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }
}
