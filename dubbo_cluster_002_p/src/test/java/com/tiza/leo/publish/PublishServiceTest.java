package com.tiza.leo.publish;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @author leowei
 * @date 2020/11/22  - 0:28
 */
public class PublishServiceTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo.xml");
        System.out.println("=======service02=======服务提供者,开始提供服务.....");
        System.in.read();
    }

}