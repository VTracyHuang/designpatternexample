package com.tracy.pattern.proxy.staticproxy;

/**
 * created by huangyating
 *
 * @Date 2021/2/4
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课。。。");
    }
}
