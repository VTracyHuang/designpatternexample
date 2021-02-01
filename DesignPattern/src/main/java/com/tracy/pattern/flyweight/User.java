package com.tracy.pattern.flyweight;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
