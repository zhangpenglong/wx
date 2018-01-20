package com.huixiangfu.base.route.dao;

import com.huixiangfu.base.route.vo.Route;
import com.huixiangfu.base.user.vo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dongao on 2018/1/19.
 */
@Repository
public interface RouteMapper {

    List<Route> selectRoute();


}
