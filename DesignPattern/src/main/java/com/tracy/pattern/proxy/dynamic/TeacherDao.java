package com.tracy.pattern.proxy.dynamic;

/**
 * created by huangyating
 *
 * @Date 2021/2/4
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中。。。");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello," + name);
    }
}
