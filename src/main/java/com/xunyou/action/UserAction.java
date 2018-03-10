package com.xunyou.action;

import com.xunyou.model.UserEntity;
import com.xunyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return "success";
    }

    @RequestMapping (value = "cklogin")
    public String ckLogin(HttpServletRequest request, HttpServletResponse response) {
          UserEntity user=(UserEntity) request.getSession().getAttribute("user");
          if(user==null)
              return  "unlogin";
            return "login";
    }
}