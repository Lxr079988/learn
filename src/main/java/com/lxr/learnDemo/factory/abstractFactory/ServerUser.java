package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname ServerUser
 * @Description TODO
 * @Date 2022/4/20 16:02
 * @Created by Jimliu
 */
public interface ServerUser {

    void insert(User user);

    User getUser(Integer id);
}
