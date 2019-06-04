package com.wornming.web;

import com.wornming.util.ApplicationProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wornming
 * @version 1.0
 * @since 2019/6/4 21:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTests {
    @Autowired
    private ApplicationProperties applicationProperties;

    @Test
    public void getHello() {
        System.out.println(applicationProperties.getTitle());
        Assert.assertEquals(applicationProperties.getTitle(), "wornming");
        Assert.assertEquals(applicationProperties.getDescription(), "study spring boot");
    }

    @Test
    public void testMap() {
        Map<String, Long> orderMinTime=new HashMap<String, Long>();
        long xx=orderMinTime.get("123");
        System.out.println(xx);
    }
}
