package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname SqlserverUser
 * @Description TODO
 * @Date 2022/4/20 15:50
 * @Created by Jimliu
 */
public class SqlserverUser implements ServerUser{

    public void insert(User user){
        System.out.println("Sqlserver新增一个用户");
    }

    public User getUser(Integer id){
        System.out.println("Sqlserver获取一个用户");
        return null;
    }
}
