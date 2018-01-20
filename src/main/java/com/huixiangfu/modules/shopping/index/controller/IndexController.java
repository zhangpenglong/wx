package com.huixiangfu.modules.shopping.index.controller;

import com.huixiangfu.base.roll.vo.Roll;
import com.huixiangfu.base.route.vo.Route;
import com.huixiangfu.core.util.myutil.JsonUtil;
import com.huixiangfu.modules.shopping.roll.service.RollService;
import com.huixiangfu.modules.shopping.route.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dongao on 2018/1/20.
 */
@Controller
@RequestMapping(value = "/shopping/index")
public class IndexController {

    @Autowired
    private RollService rollService;
    @Autowired
    private RouteService routeService;

    @RequestMapping(value = "/toIndex")
    public String toIndex(){

        return "modules/shopping/index";
    }

    @RequestMapping(value = "index")
    @ResponseBody
    public String index() throws IOException{
        Map map = new HashMap();
        map.put("code",0);
        map.put("msg","请求错误");
        try {
            List<Roll> allRoll = rollService.getAllRoll();
            if(!org.springframework.util.CollectionUtils.isEmpty(allRoll)){
                map.put("rollList",allRoll);
            }
            List<Route> routes = routeService.selectRoute();
            if(!CollectionUtils.isEmpty(routes)){
                map.put("routeList",routes);
            }
            map.put("code",1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JsonUtil.toJson(map);
    }
}
