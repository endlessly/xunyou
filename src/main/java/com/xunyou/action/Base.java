package com.xunyou.action;


import com.xunyou.model.UserEntity;
import com.xunyou.utils.ResultMsgDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Base {

    protected ResultMsgDto res;
    public Base(){
        res=new ResultMsgDto();
    }
    public UserEntity checkLogin(HttpServletRequest request) {
        UserEntity userEntity = (com.xunyou.model.UserEntity) request.getSession().getAttribute("user");
        if (null == userEntity) return null;
        return userEntity;
    }

    public void printTime(ProceedingJoinPoint pjp) {
    }

}
