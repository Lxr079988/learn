package com.lxr.learnDemo.factory.factoryFunction;

import com.lxr.learnDemo.factory.simpleFactory.SimpleFactory;

/**
 * @Classname CustomerClient
 * @Description TODO
 * @Date 2022/4/20 14:50
 * @Created by Jimliu
 */
public class CustomerClient {
    public static void main(String[] args) {
        IFactory factory = new VolunteerFactory();
        LeiFeng undergraduate = factory.createLeiFeng();
        undergraduate.BuyRice();
        undergraduate.Sweep();
        undergraduate.Wash();
    }
}
