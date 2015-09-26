package com.viathink.sys.web.controller;

import com.viathink.frame.core.dao.BaseService;
import com.viathink.frame.core.web.controller.BaseControllerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/test/login")
public class MyController {
    @RequestMapping(value = "a")
    String hello(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("=========================");
        return "/test/login/a";
    }
}