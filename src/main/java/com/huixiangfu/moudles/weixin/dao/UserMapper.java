package com.huixiangfu.moudles.weixin.dao;

import com.huixiangfu.moudles.weixin.vo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by dongao on 2018/1/19.
 */
@Repository
public interface UserMapper {

    User getUser();
}
