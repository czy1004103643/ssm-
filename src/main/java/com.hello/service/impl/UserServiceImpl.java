package com.hello.service.impl;

import com.hello.dao.IUserDao;
import com.hello.model.User;
import com.hello.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

    @Override
    public void insertUser(User user) {
        this.userDao.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        this.userDao.deleteUser(user);
    }

}
