package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname ServerFactory
 * @Description TODO
 * @Date 2022/4/20 16:06
 * @Created by Jimliu
 */
public interface ServerFactory {
    ServerUser createServer();

    ServerDepartment createDepartmentServer();
}
