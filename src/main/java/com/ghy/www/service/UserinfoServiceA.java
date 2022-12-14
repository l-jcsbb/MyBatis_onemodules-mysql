package com.ghy.www.service;

import com.ghy.www.entity.Userinfo;
import com.ghy.www.sqlmapping.UserinfoMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoServiceA {
    @Autowired
    private UserinfoMapper userinfoMapper;
    public void insertUserinfo1(){
        Userinfo userinfo = new Userinfo();
        userinfo.setUsername("中国MyBatis3");
        userinfo.setPassword("中国人MyBAITS3");
        userinfoMapper.insert(userinfo);
    }
}
