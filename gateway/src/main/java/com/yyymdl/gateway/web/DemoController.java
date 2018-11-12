package com.yyymdl.gateway.web;

import com.yyymdl.gateway.event.RefreshRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DemoController {

    @Autowired
    RefreshRouteService refreshRouteService;

    @RequestMapping("/refreshRoute")
    public String refreshRoute(){
        refreshRouteService.refreshRoute();
        return "refreshRoute";
    }

    @Autowired
    ZuulHandlerMapping zuulHandlerMapping;

    @RequestMapping("/watchNowRoute")
    @ResponseBody
    public List<Route> watchNowRoute(){
        //可以用debug模式看里面具体是什么
        //Map<String, Object> handlerMap = zuulHandlerMapping.getHandlerMap();
        List<Route> list = refreshRouteService.getAllRules();
        return list;
    }



}
