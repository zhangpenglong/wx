package com.huixiangfu.modules.weixin.controller;

import com.huixiangfu.base.user.vo.User;
import com.huixiangfu.modules.weixin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dongao on 2018/1/19.
 */
@Controller
@RequestMapping("hello")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        try {
            User user = userService.getUser();
            return userService.getUser().getMoney();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "1";
    }

    @RequestMapping("view")
    public String view(){
        return "modules/shopping/index";
    }
}
