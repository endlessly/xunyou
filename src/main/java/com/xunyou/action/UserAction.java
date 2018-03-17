package com.xunyou.action;

import com.sun.corba.se.spi.ior.IdentifiableFactory;
import com.sun.org.apache.regexp.internal.RE;
import com.xunyou.exception.Fail;
import com.xunyou.model.UserEntity;
import com.xunyou.model.UserInfoEntity;
import com.xunyou.service.UserInfoService;
import com.xunyou.service.UserService;
import com.xunyou.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserAction extends Base {

    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "user/login")
    public ModelAndView Index(ModelAndView modelAndView) throws Fail {
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/")
    public ModelAndView welcome(HttpServletRequest request, ModelAndView modelAndView) throws Fail {
        HttpSession session = request.getSession();
        modelAndView.setViewName("index");
        return modelAndView;
    }


    @RequestMapping(value = "login")
    public void login(HttpServletRequest request, HttpServletResponse respons) throws Fail, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username == null || password == null) {
            throw new Fail("用户名密码不能为空");
        }
        password = MD5Util.getMD5Code(password);
        UserEntity user = userService.selectIdByNameAndPwd(username, password);
        if (null == user) {
            throw new Fail("登录失败");
        }

        HttpSession session = request.getSession();
        session.setAttribute("user", 5555);
        respons.sendRedirect("/");


    }

    @ResponseBody
    @RequestMapping(value = "cklogin")
    public ResultMsgDto isLogin(HttpServletRequest request, HttpServletResponse response) throws Fail {
        UserEntity userEntity = this.checkLogin(request);
        if (null == userEntity) throw new Fail("未登录");
        return res.success("已登录", userEntity);
    }

    @ResponseBody
    @RequestMapping(value = "register")
    public ResultMsgDto register(@RequestBody ModelMap modelMap) throws InstantiationException, IllegalAccessException, IOException, Fail {
        UserEntity userEntity = new UserEntity();
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        //获取raw格式数据
        //user为输入的rawjson下面的user信息
        String user = JsonUtil.toJson(modelMap.get("user"));
        String userInfo = JsonUtil.toJson(modelMap.get("userInfo"));
        Map userMap = JsonUtil.JsonTomap(user);
        Map userInfoMap = JsonUtil.JsonTomap(userInfo);
        userEntity = MapEntryConvet.toBean(userEntity.getClass(), userMap);
        //将用户密码加密存储
        userEntity.setPassword(MD5Util.getMD5Code(userEntity.getPassword()));
        userInfoEntity = MapEntryConvet.toBean(userInfoEntity.getClass(), userInfoMap);
        userService.insert(userEntity);
        if (null != userEntity.getId()) {
            userInfoEntity.setUid(userEntity.getId());
            userInfoService.insert(userInfoEntity);
        }
        return res.fail("注册成功", userEntity);
    }

    @ResponseBody
    @RequestMapping(value = "update")
    public ResultMsgDto update(HttpServletRequest request, HttpServletResponse response) throws Fail {
        String nickName = request.getParameter("nickName");
        if (null == nickName) {
            throw new Fail("未做修改");

        }

        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        if (null == user) {
            throw new Fail("请先登录");
        }

        user.setNickName(nickName);
        if (0 == userService.update(user)) {
            throw new Fail("请稍后再试");

        }
        return res.success("修改成功", user);
    }

    @ResponseBody
    @RequestMapping("headUpload")
    public ResultMsgDto UpdateImage(HttpServletRequest request) throws IOException, Fail {
        List list = FileUpload.springUpload(request);
        if (list.isEmpty()) throw new Fail("请选择文件");
        return res.success("上传成功", list.get(0));
    }

    @RequestMapping("test")
    public String test() {
        return "error";
    }
}