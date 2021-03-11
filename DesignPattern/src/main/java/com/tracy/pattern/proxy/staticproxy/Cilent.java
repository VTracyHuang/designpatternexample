package com.tracy.pattern.proxy.staticproxy;

/**
 * created by huangyating
 *
 * @Date 2021/2/4
 */
public class Cilent {
    public static void main(String[] args) {
        //创建目标对象(被代理对象)
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象，同时将被代理对象传给代理对象
        TeacherProxy teacherProxy = new TeacherProxy(teacherDao);

        //通过代理对象，调用被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teacherProxy.teach();
    }
}
