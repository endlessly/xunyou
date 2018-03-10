package com.xunyou.utils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {
    /**
     * 获取request中参数
     *
     * @param request 页面请求
     */
    public static Map<String, Object> getRequestParameters(HttpServletRequest request) {
        String parameters = "";//请求参数
        if ("GET".equals(request.getMethod())) {//GET请求时的参数
            String urlParameter = request.getQueryString();//网址中的参数
            if (urlParameter != null && !"".equals(urlParameter)) {
                try {
                    urlParameter = URLDecoder.decode(urlParameter, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            } else {
                urlParameter = "";
            }
            parameters = urlParameter;
        } else if ("POST".equals(request.getMethod())) {//POST请求时的参数
            String totalParameter = "";//表单及网址中全部参数
            Map<String, String[]> params = request.getParameterMap();
            int parametersNum = request.getParameterMap().size();//参数个数
            int flag = 1;
            for (String key : params.keySet()) {

                String[] values = params.get(key);
                for (int i = 0; i < values.length; i++) {
                    String value = values[i];
                    totalParameter += key + "=" + value;
                }
                if (flag < parametersNum) {
                    totalParameter += "&";
                }
                flag += 1;
            }
            parameters = totalParameter;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        String[] arr = parameters.split("&");
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i].substring(0, arr[i].indexOf("="));
            String value = arr[i].substring(arr[i].indexOf("=") + 1);
            map.put(key, value);
        }
        return map;
    }
}