package com.tracy.pattern.facade;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
public class Projector {

    public static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
    public void focus(){
        System.out.println("Projector focused");
    }
}
