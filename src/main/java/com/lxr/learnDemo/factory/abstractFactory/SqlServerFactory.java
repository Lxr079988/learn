package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname SqlServerFactory
 * @Description TODO
 * @Date 2022/4/20 16:07
 * @Created by Jimliu
 */
public class SqlServerFactory implements ServerFactory {
    @Override
    public ServerUser createServer() {
        return new SqlserverUser();
    }

    @Override
    public ServerDepartment createDepartmentServer() {
        return new SqlServerDepartment();
    }
}
