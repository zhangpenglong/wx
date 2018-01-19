package com.huixiangfu.moudles.weixin.controller;

import com.huixiangfu.moudles.weixin.service.UserService;
import com.huixiangfu.moudles.weixin.vo.User;
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
        return "";
    }
}
