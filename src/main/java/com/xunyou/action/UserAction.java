package com.xunyou.action;

import com.alibaba.fastjson.JSON;
import com.xunyou.model.UserEntity;
import com.xunyou.model.UserInfoEntity;
import com.xunyou.service.UserService;
import com.xunyou.utils.RequestUtil;
import com.xunyou.utils.ResultMsgDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@ResponseBody
public class UserAction  {
    @Autowired
    UserService userService;

    @RequestMapping(value = "indexs", method = RequestMethod.POST)
    public String Index() {
        return "fsdf";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response) {
        String username =request.getParameter("username");
        String password =request.getParameter("password");

        if (username == null || password == null) {
            return "fail";
        }
        List list = new ArrayList();
        UserEntity user = userService.selectIdByNameAndPwd(username, password);
        if (null == user)
            return "fail";
//        Map session=(Map) request.getSession();
//        session.put("user",user);
       HttpSession session= request.getSession();
       session.setAttribute("user",user);
        return  "success";
    }

    @RequestMapping (value = "cklogin")
    public String ckLogin(HttpServletRequest request, HttpServletResponse response) {
        UserEntity user=(UserEntity) request.getSession().getAttribute("user");
        if(user==null)
            return  "unlogin";
        return "login";
    }

    @RequestMapping (value = "register")
    public String register(@RequestBody HttpServletRequest request) {
    System.out.println(request.getParameterNames());
        return "";
    }

    }