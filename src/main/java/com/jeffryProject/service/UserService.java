package com.jeffryProject.service;

import com.jeffryProject.entity.User;

public interface UserService {
    //根据id查找用户信息
    public User findUserByUid(int uid);
}
