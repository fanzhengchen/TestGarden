package com.hcb.util;

import java.util.Random;

/**
 * Created by mark on 16-2-19.
 */
public class RandomUtil {

    private static long seed = 41545454545451l;

    public static String captcha() {
        return Integer.toString(randomNumber(1000000));
    }

    public static int randomNumber(int range) {
        Random random = new Random(seed);
        return random.nextInt(range);
    }
}
