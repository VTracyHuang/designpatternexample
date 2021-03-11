package com.tracy.pattern.proxy.cglib;

/**
 * created by huangyating
 *
 * @Date 2021/2/5
 */
public class TeacherDao {

    public String teach() {
        System.out.println("老师在授课，我是cgLib代理不需要实现接口");
        return "Hello";
    }
}
