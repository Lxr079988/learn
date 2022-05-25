package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname SqlServerDepartment
 * @Description TODO
 * @Date 2022/4/20 18:26
 * @Created by Jimliu
 */
public class SqlServerDepartment implements ServerDepartment {
    @Override
    public void inseetDepartment(Department department) {
        System.out.println("SqlServer插入一个部门");
    }

    @Override
    public Department getDepartment(Integer id) {
        System.out.println("SqlServer查询一个部门");
        return null;
    }
}
