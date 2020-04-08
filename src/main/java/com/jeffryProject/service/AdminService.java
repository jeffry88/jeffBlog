package com.jeffryProject.service;

import com.jeffryProject.entity.Psw;
import com.jeffryProject.entity.User;
import com.jeffryProject.error.CommonException;

public interface AdminService {
    //根据id查找用户信息
    User findUserByUid(int uid);

    //根据name查找用户信息
    User findUserByUsername(String username);

    //获取用户密码及盐值
    Psw getUserPsw(int uid) throws CommonException;
    //用户登录校验
    User validateLogin (String logName,String password) throws CommonException;
    //创建用户
    void createUser(User user) throws CommonException;
}
