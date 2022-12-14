package com.ghy.www.controller;

import com.ghy.www.service.UserinfoServiceA;
import com.ghy.www.service.UserinfoServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Transactional
public class TestController {
    @Autowired
    private UserinfoServiceA userinfoServiceA;
    @Autowired
    private UserinfoServiceB userinfoServiceB;
    @RequestMapping("test1")
    public void test1(HttpServletRequest request, HttpServletResponse response){
        userinfoServiceA.insertUserinfo1();
        userinfoServiceA.insertUserinfo1();
    }
    @RequestMapping("test2")
    public void test2(HttpServletRequest request,HttpServletResponse response){
        userinfoServiceA.insertUserinfo1();
        userinfoServiceB.insertUserinfo2();
    }
}
