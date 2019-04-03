package com.blog.service.impl;

import com.blog.dao.UserDao;
import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.insert(user);
    }

    @Override
    public User getUser(Integer id) {
        return userDao.queryUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.update(user) > 0;
    }

    @Override
    public boolean delUser(Integer id) {
        return userDao.delUser(id) > 0;
    }
}
