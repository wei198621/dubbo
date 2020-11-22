package com.tiza.leo.service;

/**
 * @author leowei
 * @date 2020/11/22  - 0:14
 */
public class UserServiceImplNew implements UserService {
    public String findName(String name) {
        System.out.println("姓名  New  :" +name);
        return "hello  New  : "+name;
    }

    public void addUser(String username) {

        System.out.println("添加用户,用户名为  New  : "+username);
    }
}
