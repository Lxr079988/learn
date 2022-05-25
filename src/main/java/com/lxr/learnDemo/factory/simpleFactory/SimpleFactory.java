package com.lxr.learnDemo.factory.simpleFactory;

import com.lxr.learnDemo.factory.factoryFunction.LeiFeng;
import com.lxr.learnDemo.factory.factoryFunction.Undergraduate;
import com.lxr.learnDemo.factory.factoryFunction.Volunteer;

/**
 * @Classname SimpleFactory
 * @Description TODO
 * @Date 2022/4/20 15:08
 * @Created by Jimliu
 */
public class SimpleFactory {

    public static LeiFeng createLeiFeng(String type){
        LeiFeng result = null;
        switch (type){
            case "大学生":
                result = new Undergraduate();
                break;
            case "志愿者":
                result = new Volunteer();
                break;
        }
        return result;
    }
}
