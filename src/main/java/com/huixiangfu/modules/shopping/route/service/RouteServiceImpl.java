package com.huixiangfu.modules.shopping.route.service;

import com.huixiangfu.base.roll.dao.RollMapper;
import com.huixiangfu.base.roll.vo.Roll;
import com.huixiangfu.base.route.dao.RouteMapper;
import com.huixiangfu.base.route.vo.Route;
import com.huixiangfu.modules.shopping.roll.service.RollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by dongao on 2018/1/20.
 */
@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteMapper RouteMapper;

    @Override
    public List<Route> selectRoute() {
        return RouteMapper.selectRoute();
    }
}
