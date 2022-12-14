package com.ghy.www.sqlmapping;

import com.ghy.www.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserinfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Userinfo record);


    Userinfo selectByPrimaryKey(Integer id);


    List<Userinfo> selectAll();


    int updateByPrimaryKey(Userinfo record);
}