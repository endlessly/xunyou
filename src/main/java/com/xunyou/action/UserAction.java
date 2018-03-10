package com.xunyou.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xunyou.model.UserEntity;
import com.xunyou.model.UserInfoEntity;
import com.xunyou.service.UserInfoService;
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
    @Autowired
    UserInfoService userInfoService;

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
        UserInfoEntity userInfoEntity=new UserInfoEntity();
        //获取raw格式数据
        //user为输入的rawjson下面的user信息
        String user = JsonUtil.toJson(modelMap.get("user"));
        String userInfo=JsonUtil.toJson(modelMap.get("userInfo"));
        Map userMap = JsonUtil.JsonTomap(user);
        Map userInfoMap=JsonUtil.JsonTomap(userInfo);
        userEntity = MapEntryConvet.toBean(userEntity.getClass(), userMap);
        userEntity.setSex(true);
        userEntity.setIsQualification(false);
        userEntity.setStatus(true);
        userInfoEntity=MapEntryConvet.toBean(userInfoEntity.getClass(),userInfoMap);
        userService.insert(userEntity);
        if(null!=userEntity.getId()) {
            userInfoEntity.setUid(userEntity.getId());
            userInfoService.insert(userInfoEntity);
            return JsonUtil.toJson(userEntity) + JsonUtil.toJson(userInfoEntity);
        }
           return "注册错误";
    }
    @RequestMapping(value = "update")
    public ResultMsgDto update(HttpServletRequest request, HttpServletResponse response) {
        ResultMsgDto resultMsgDto=new ResultMsgDto();
        String  nickName = request.getParameter("nickName");
        if (null==nickName){
            resultMsgDto.setResultCode(0);
            resultMsgDto.setResultMsg("未做修改");
                return resultMsgDto;
        }

       UserEntity user= (UserEntity) request.getSession().getAttribute("user");
        if (null==user){
            resultMsgDto.setResultCode(0);
            resultMsgDto.setResultMsg("请先登录");
            return resultMsgDto;
        }

       user.setNickName(nickName);
     if ( 0==userService.update(user)){
         resultMsgDto.setResultCode(0);
         resultMsgDto.setResultMsg("请稍后再试");
         return resultMsgDto;
     }
        resultMsgDto.setResultCode(1);
        resultMsgDto.setResultMsg("修改成功");
        return resultMsgDto;




}