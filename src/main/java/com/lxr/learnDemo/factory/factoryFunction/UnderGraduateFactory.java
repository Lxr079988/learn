package com.lxr.learnDemo.factory.factoryFunction;

/**
 * @Classname UnderGraduateFactory
 * @Description TODO
 * @Date 2022/4/20 15:16
 * @Created by Jimliu
 */
public class UnderGraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
