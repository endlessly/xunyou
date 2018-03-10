package com.xunyou.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xunyou.model.UserEntity;
import com.xunyou.model.UserInfoEntity;
import com.xunyou.service.UserService;
import com.xunyou.utils.JsonUtil;
import com.xunyou.utils.MapEntryConvet;
import com.xunyou.utils.ResultMsgDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.*;

@Controller
@ResponseBody
public class UserAction {
    @Autowired
    UserService userService;

    @RequestMapping(value = "indexs", method = RequestMethod.POST)
    public String Index() {
        return "fsdf";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || password == null) {
            return "fail";
        }
        List list = new ArrayList();
        UserEntity user = userService.selectIdByNameAndPwd(username, password);
        if (null == user)
            return "fail";
//        Map session=(Map) request.getSession();
//        session.put("user",user);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        return "success";
    }

    @RequestMapping(value = "cklogin")
    public String ckLogin(HttpServletRequest request, HttpServletResponse response) {
        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        if (user == null)
            return "unlogin";
        return "login";
    }

    @RequestMapping(value = "register")
    public String register(@RequestBody ModelMap modelMap) throws InstantiationException, IllegalAccessException, IOException {
        UserEntity userEntity = new UserEntity();
        String user = JsonUtil.toJson(modelMap.get("user"));
        Map maps = JsonUtil.JsonTomap(user);
        userEntity = MapEntryConvet.toBean(userEntity.getClass(), maps);
        System.out.println(JsonUtil.toJson(userEntity));
        return "";
    }

}