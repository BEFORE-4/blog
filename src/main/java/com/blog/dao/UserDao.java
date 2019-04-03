package com.blog.dao;

import com.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    int insert(User user);
    int delUser(Integer id);
    User queryUserById(Integer id);
    int update(User user);
}
