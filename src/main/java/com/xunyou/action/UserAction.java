package com.xunyou.action;

import com.xunyou.model.UserEntity;
import com.xunyou.model.UserInfoEntity;
import com.xunyou.service.UserInfoService;
import com.xunyou.service.UserService;
import com.xunyou.utils.JsonUtil;
import com.xunyou.utils.MapEntryConvet;
import com.xunyou.utils.ResultMsgDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
public class UserAction extends Base {

    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "indexs", method = RequestMethod.POST)
    public String Index() {
        return "fsdf";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ResultMsgDto login(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || password == null) {
            res.fail("用户名密码不能为空", "");
        }
        UserEntity user = userService.selectIdByNameAndPwd(username, password);
        if (null == user) {
            res.fail("登录失败", "");
        }
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        return res.success("登录成功", user);
    }

    @RequestMapping(value = "cklogin")
    public ResultMsgDto isLogin(HttpServletRequest request, HttpServletResponse response) {
        UserEntity userEntity = this.checkLogin(request);
        if (null == userEntity) return res.fail("未登录", "");
        return res.success("已登录", userEntity);
    }

    @RequestMapping(value = "register")
    public ResultMsgDto register(@RequestBody ModelMap modelMap) throws InstantiationException, IllegalAccessException, IOException {
        UserEntity userEntity = new UserEntity();
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        //获取raw格式数据
        //user为输入的rawjson下面的user信息
        String user = JsonUtil.toJson(modelMap.get("user"));
        String userInfo = JsonUtil.toJson(modelMap.get("userInfo"));
        Map userMap = JsonUtil.JsonTomap(user);
        Map userInfoMap = JsonUtil.JsonTomap(userInfo);
        userEntity = MapEntryConvet.toBean(userEntity.getClass(), userMap);
        userEntity.setSex(true);
        userEntity.setIsQualification(false);
        userEntity.setStatus(true);
        userInfoEntity = MapEntryConvet.toBean(userInfoEntity.getClass(), userInfoMap);
        userService.insert(userEntity);
        if (null != userEntity.getId()) {
            userInfoEntity.setUid(userEntity.getId());
            userInfoService.insert(userInfoEntity);
            return res.fail("注册失败", "");

        }
        return res.fail("注册成功", userEntity);
    }

    @RequestMapping(value = "update")
    public ResultMsgDto update(HttpServletRequest request, HttpServletResponse response) {
        String nickName = request.getParameter("nickName");
        if (null == nickName) {
            return res.fail("未做修改", "");
        }

        UserEntity user = (UserEntity) request.getSession().getAttribute("user");
        if (null == user) {
            return res.fail("请先登录", "");
        }

        user.setNickName(nickName);
        if (0 == userService.update(user)) {
            return res.fail("请稍后再试", "");
        }
        return res.success("修改成功", user);
    }
}