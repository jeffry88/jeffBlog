package com.jeffryProject;

import com.jeffryProject.dao.UserMapper;
import com.jeffryProject.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testDetUserByUid(){
        int uid = 100001;
        User user = userMapper.selectByPrimaryKey(uid);
        System.out.println(user.getUid() + ":" + user.getUsername());
    }


}
