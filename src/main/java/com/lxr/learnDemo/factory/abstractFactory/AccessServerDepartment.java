package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname AccessServerDepartment
 * @Description TODO
 * @Date 2022/4/20 18:27
 * @Created by Jimliu
 */
public class AccessServerDepartment implements ServerDepartment {
    @Override
    public void inseetDepartment(Department department) {
        System.out.println("AccessServer插入一个部门");
    }

    @Override
    public Department getDepartment(Integer id) {
        System.out.println("AccessServer查询一个部门");
        return null;
    }
}
