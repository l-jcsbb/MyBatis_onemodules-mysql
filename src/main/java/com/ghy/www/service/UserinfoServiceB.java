package com.ghy.www.service;

import com.ghy.www.entity.Userinfo;
import com.ghy.www.sqlmapping.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServiceB {
    @Autowired
    private UserinfoMapper userinfoMapper;
    public void insertUserinfo2(){
        Userinfo userinfo = new Userinfo();
        userinfo.setUsername("中国");
        userinfo.setPassword("中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人" +
                "中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人中国人");
        userinfoMapper.insert(userinfo);
    }
}
