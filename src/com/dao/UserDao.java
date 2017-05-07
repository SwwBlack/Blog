package com.dao;

import com.bean.User;

public interface UserDao {
    public void add(User user);
    public User findUser(String username);
}
