package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname SqlserverClient
 * @Description TODO
 * @Date 2022/4/20 15:52
 * @Created by Jimliu
 */
public class SqlserverClient {
    public static void main(String[] args) {
        ServerFactory accessServerFactory = new AccessServerFactory();
        User user = new User();
        ServerUser sqlserverUser =accessServerFactory.createServer();
        sqlserverUser.insert(user);
        sqlserverUser.getUser(1);

        ServerDepartment departmentServer = accessServerFactory.createDepartmentServer();
        departmentServer.inseetDepartment(new Department());
        departmentServer.getDepartment(1);
    }
}
