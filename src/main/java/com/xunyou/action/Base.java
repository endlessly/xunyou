package com.xunyou.action;


import com.xunyou.model.UserEntity;
import com.xunyou.utils.ResultMsgDto;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Base {
    ResultMsgDto res = new ResultMsgDto();

    public UserEntity checkLogin(HttpServletRequest request) {
        UserEntity userEntity = (com.xunyou.model.UserEntity) request.getSession().getAttribute("user");
        if (null == userEntity) return null;
        return userEntity;
    }
}
