package com.tracy.pattern.facade;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
public class PopcornPoper {

    public static PopcornPoper instance = new PopcornPoper();

    public static PopcornPoper getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("popcorn poper on");
    }
    public void off(){
        System.out.println("popcorn poper off");
    }
    public void pop(){
        System.out.println("popcorn poper is poping");
    }
}
