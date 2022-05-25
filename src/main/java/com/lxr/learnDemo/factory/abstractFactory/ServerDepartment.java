package com.lxr.learnDemo.factory.abstractFactory;

/**
 * @Classname ServerDepartment
 * @Description TODO
 * @Date 2022/4/20 18:23
 * @Created by Jimliu
 */
public interface ServerDepartment {
    void inseetDepartment(Department department);

    Department getDepartment(Integer id);
}
