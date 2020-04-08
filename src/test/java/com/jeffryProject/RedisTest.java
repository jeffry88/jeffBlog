package com.jeffryProject;

import com.jeffryProject.service.JedisClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-spring-redis.xml")
public class RedisTest {
    @Autowired
    private JedisClientService jedisClientService;
    @Test
    public void testRedis()
    {
//        String val = "222";
//        String key = "test";
//        String str = jedisClientService.set(key,val);
//        System.out.println(str);
        String str = jedisClientService.get("test");
        System.out.println(str);
    }
}
