package com.tracy.pattern.visitor;

/**
 * created by huangyating
 *
 * @Date 2021/2/23
 */
public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
