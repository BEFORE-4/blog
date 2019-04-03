package com.blog.service;

import com.blog.entity.User;

public interface UserService {
    void save(User user);
    User getUser(Integer id);
    boolean updateUser(User user);
    boolean delUser(Integer id);
}
