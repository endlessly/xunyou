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
import java.util.HashMap;
import java.util.Map;

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
    public String login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        Map map=new HashMap();
        map.put("username",username);
        map.put("password",password);

        if (username == null || password == null) {
            return "fail";
        }
//        List list=new arrayList();
        UserEntity userEntity = userService.selectIdByNameAndPwd(map);
        if (null == userEntity)
            return "fail";
        return "success";
    }
}
