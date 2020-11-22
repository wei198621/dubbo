package com.tiza.leo.invoke;

import com.tiza.leo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author leowei
 * @date 2020/11/22  - 1:07
 */
public class InvokeServiceTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo.xml");
        UserService userService = (UserService) context.getBean("userService");
       /* String serverReturn = userService.findName("GouSheng");
        System.out.println("get message from server message is  " + serverReturn);*/
    }

}