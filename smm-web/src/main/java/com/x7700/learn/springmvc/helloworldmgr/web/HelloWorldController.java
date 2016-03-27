package com.x7700.learn.springmvc.helloworldmgr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.x7700.learn.springmvc.helloworldmgr.service.IHelloService;

@Controller
@RequestMapping(value = "/learn/")
public class HelloWorldController {

    @Resource
    private List<IHelloService> helloServiceList;

    @RequestMapping(value = "helloworld")
    @ResponseBody
    public String handleRequest(String name) throws Exception {

        return "hello " + name;
    }
}
