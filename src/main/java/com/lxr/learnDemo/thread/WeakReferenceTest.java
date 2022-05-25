package com.lxr.learnDemo.thread;

import java.lang.ref.WeakReference;

/**
 * @Classname WeakReferenceTest
 * @Description TODO
 * @Date 2022/5/24 16:55
 * @Created by Jimliu
 */
public class WeakReferenceTest {

    /**
     * 弱引用 发现就回收
     * @param args
     */
    public static void main(String[] args) {
        WeakReference<M> mWeakReference = new WeakReference<>(new M());
        System.out.println(mWeakReference.get());
        System.gc();
        System.out.println(mWeakReference.get());


        ThreadLocal<M> objectThreadLocal = new ThreadLocal<>();
        objectThreadLocal.set(new M());
        objectThreadLocal.remove();
    }


    public static class M{
        @Override
        protected void finalize() throws Throwable {
            System.out.println("被垃圾回收器回收了！");
        }
    }
}
