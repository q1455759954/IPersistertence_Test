package com.test.dao;

import com.test.entity.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll(User user);

    List<User> findAll2();

}
