package com.tiza.leo.service;

/**
 * @author leowei
 * @date 2020/11/22  - 0:14
 */
public class UserServiceImpl implements UserService {
    public String findName(String name) {
        System.out.println("====server1=====  姓名:" +name);
        return "====server1=====  hello: "+name;
    }

    public void addUser(String username) {

        System.out.println("添加用户,用户名为: "+username);
    }
}
