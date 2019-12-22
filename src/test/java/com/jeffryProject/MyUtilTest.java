package com.jeffryProject;

import com.jeffryProject.entity.User;
import com.jeffryProject.utils.MyUtils;
import org.junit.Test;

public class MyUtilTest {
    @Test
    public void testSalt(){
        String salt = MyUtils.salt(8);
        System.out.println(salt);
    }

    @Test
    public void testSaltPsw(){
        String salt = "n26booy2";
        String psw = MyUtils.pswSalt("123456",salt);
        System.out.println("salt:" + salt);
        System.out.println("psw:" + psw);

    }
}
