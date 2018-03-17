package com.xunyou.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.UUID;

public class MD5Util {
    public static String getMD5Code(String code) throws UnsupportedEncodingException {

        // //确定计算方法
        // MessageDigest md5=MessageDigest.getInstance("MD5");
        // BASE64Encoder base64en = new BASE64Encoder();
        // //加密后的字符串
        // String newstr=base64en.encode(md5.digest(code.getBytes("utf-8")));
        // return newstr;
        String resultString = null;
        try {
            resultString = new String(code);
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
        } catch (java.lang.Exception md) {
        }
        return resultString + resultString.substring(0, 3).toLowerCase();
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; ++i)
            resultSb.append(byteToHexString(b[i]));

        return resultSb.toString();
    }

    private static Object byteToHexString(byte b) {
        String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
                "e", "f"};
        int n = b;
        if (n < 0)
            n += 256;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    public static String uuid(String prefix) {

        return prefix + "_" + UUID.randomUUID().toString();//用来生成数据库的主键id非常不错。。
    }

}
