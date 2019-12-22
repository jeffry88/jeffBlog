package com.jeffryProject.service.impl;

import com.jeffryProject.dao.UserMapper;
import com.jeffryProject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jeffryProject.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserByUid(int uid) {
        User user = userMapper.selectUserInfo(uid);
        if (user == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createTime = user.getCreateTime();
        String sd = sdf.format(new Date(Long.parseLong(createTime + "000")));// 时间戳转换成时间
        user.setCreateTime(sd);
        return user;
    }
}
