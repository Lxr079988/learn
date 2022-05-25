package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname AccessserverUser
 * @Description TODO
 * @Date 2022/4/20 16:05
 * @Created by Jimliu
 */
public class AccessserverUser implements ServerUser {
    @Override
    public void insert(User user) {
        System.out.println("Accessserver新增一个用户");
    }

    @Override
    public User getUser(Integer id) {
        System.out.println("Accessserver获取一个用户");
        return null;
    }
}
