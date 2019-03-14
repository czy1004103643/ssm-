package com.hello.dao;

import com.hello.model.User;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */
public interface IUserDao {
    User selectUser(long id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
