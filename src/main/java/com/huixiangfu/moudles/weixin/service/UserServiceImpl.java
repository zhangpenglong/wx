package com.huixiangfu.moudles.weixin.service;

import com.huixiangfu.moudles.weixin.dao.UserMapper;
import com.huixiangfu.moudles.weixin.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dongao on 2018/1/19.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser() {
        return userMapper.getUser();
    }
}
