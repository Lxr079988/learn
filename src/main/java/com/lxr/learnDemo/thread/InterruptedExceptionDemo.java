package com.lxr.learnDemo.thread;

/**
 * @Classname InterruptedExceptionDemo
 * @Description TODO
 * @Date 2022/5/18 15:18
 * @Created by Jimliu
 */
public class InterruptedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1  = new Thread(){
            @Override
            public void run() {

                while (true){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Interrupted!");
                        break;
                    }

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted when sleep");
                        Thread.currentThread().interrupt();
                    }

                    Thread.yield();
                }
            }
        };

        t1.start();
        Thread.sleep(1000);
        t1.interrupt();
    }
}
