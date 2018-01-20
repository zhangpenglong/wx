package com.huixiangfu.base.user.dao;

import com.huixiangfu.base.user.vo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by dongao on 2018/1/19.
 */
@Repository
public interface UserMapper {

    User getUser();
}
