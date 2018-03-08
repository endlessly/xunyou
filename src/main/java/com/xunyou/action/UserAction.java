package com.xunyou.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserAction {
    @RequestMapping("/indexs")
    public String Index() {
        return "fsdf";
    }
}
