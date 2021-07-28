package com.mytest.boot.mapper;

import com.mytest.boot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //@Select("SELECT id, username, password FROM t_user;")
    List<User> findAll();
}
