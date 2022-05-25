package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname AccessServerFactory
 * @Description TODO
 * @Date 2022/4/20 16:08
 * @Created by Jimliu
 */
public class AccessServerFactory implements ServerFactory {
    @Override
    public ServerUser createServer() {
        return new AccessserverUser();
    }

    @Override
    public ServerDepartment createDepartmentServer() {
        return new AccessServerDepartment();
    }
}
