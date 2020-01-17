package com.example.shiro;

import javax.annotation.security.RunAs;

import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authc.credential.PasswordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shizhiguo
 * @version 1.0.
 * @Description
 * @Date 2020/1/16
 */
@Slf4j
//@SpringBootTest
//@RunWith(SpringRunner.class)
public class PasswordServiceTest {
    /*@Autowired
    @Qualifier("defaultPasswordService")
    PasswordService passwordService;*/

    @Test
    public void testPassword(){
        DefaultPasswordService passwordService = new DefaultPasswordService();
        String password = passwordService.encryptPassword("123456");
        log.info(password);
    }
}
