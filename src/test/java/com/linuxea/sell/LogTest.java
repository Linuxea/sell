package com.linuxea.sell;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogTest {

    @Test
    public void test(){
        // system log level is info
        log.info("this is info");
        log.debug("this is debug");
        log.warn("this is warn");
        log.error("this is error");
    }

    @Test
    public void lombokTest(){
        String name = "linuxea";
        String password = "admin";
        log.info("username:{}, password:{}", name, password);
    }

}
