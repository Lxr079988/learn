package com.lxr.learnDemo.factory.factoryFunction;


/**
 * @Classname VolunteerFactory
 * @Description TODO
 * @Date 2022/4/20 15:16
 * @Created by Jimliu
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
