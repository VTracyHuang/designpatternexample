package com.tracy.pattern.visitor;

/**
 * created by huangyating
 *
 * @Date 2021/2/23
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
