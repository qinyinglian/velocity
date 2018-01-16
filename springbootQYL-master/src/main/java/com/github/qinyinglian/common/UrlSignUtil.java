package com.github.qinyinglian.common;

/**
 * Created by qinyinglian on 2017/7/30.
 */
public class UrlSignUtil {

    public static String sign(String param) throws Exception{

        String token="asfkdjdsljdslj";

        return param+"&token="+token+param;
    }
    public static String getToken(String param) throws Exception{

        String token="asfkdjdsljdslj";

        return token+param;
    }
}
