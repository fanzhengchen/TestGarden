package com.hcb.util;

import java.util.UUID;

/**
 * Created by mark on 16-2-19.
 */
public class UidUtil {

    public static String createId() {
        return UUID.randomUUID().toString();
    }
}
