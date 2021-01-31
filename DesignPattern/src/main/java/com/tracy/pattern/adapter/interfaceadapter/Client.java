package com.tracy.pattern.adapter.interfaceadapter;

/**
 * created by huangyating
 *
 * @Date 2020/11/18
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();
    }
}
