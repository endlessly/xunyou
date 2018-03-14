package com.xunyou.exception;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xunyou.utils.JsonUtil;
import com.xunyou.utils.ResultMsgDto;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.HashMap;
import java.util.Map;

//全局异常处理器
public class CustomExceptionResolver  implements HandlerExceptionResolver {

    //系统抛出的异常
    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {
        //handler就是处理器适配器要执行的Handler对象(只有method)
        //解析出异常类型。

        //如果该异常类型是系统自定义的异常，直接取出异常信息，在错误页面展示。
        Fail error = null;
        if (ex instanceof Fail) {
            error = (Fail) ex;

        } else {
            //如果该 异常类型不是系统 自定义的异常，构造一个自定义的异常类型（信息为“未知错误”）。
            error = new Fail(ex.getMessage());
        }

        //错误信息
        String message = error.getMessage();
        ModelAndView mav = new ModelAndView();

         if (request.getMethod().trim().toLowerCase().equals("post")) {//如果是接口请求则返回错误消息体
            MappingJackson2JsonView view = new MappingJackson2JsonView();
            Map<String, Object> result = new HashMap<String, Object>();
            result.put("resultCode", 0);
            result.put("resultObject", "");
            result.put("resultMsg", message);
            view.setAttributesMap(result);
            mav.setView(view);
            return mav;
        } else {//如果是浏览器请求则返回到错误页面
            //将错误信息传到页面
            mav.addObject("message", message);
            //指向到错误界面
            mav.setViewName("error");
            return mav;
        }

    }

}