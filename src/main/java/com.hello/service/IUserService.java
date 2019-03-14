package com.hello.service;

import com.hello.model.User;

/**
 * project #project
 * authod #authod
 * datetime #datatime
 * desc  #desc
 */

public interface IUserService {
    public User selectUser(long userId);

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);
}
