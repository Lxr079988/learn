package com.lxr.learnDemo.factory.factoryFunction;

/**
 * @Classname Undergraduate
 * @Description TODO
 * @Date 2022/4/20 14:37
 * @Created by Jimliu
 */
public class Undergraduate extends LeiFeng {
    @Override
    public void Sweep() {
        System.out.println("大学生扫地");
    }

    @Override
    public void Wash() {
        System.out.println("大学生洗衣服");
    }

    @Override
    public void BuyRice() {
        System.out.println("大学生买米");
    }
}
