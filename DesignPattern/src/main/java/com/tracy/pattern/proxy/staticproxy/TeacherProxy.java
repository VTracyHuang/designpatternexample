package com.tracy.pattern.proxy.staticproxy;

/**
 * created by huangyating
 *
 * @Date 2021/2/4
 */
//代理对象（静态代理）
public class TeacherProxy implements ITeacherDao {

    private ITeacherDao target;  //目标对象，通过接口来聚合

    //构造器
    public TeacherProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理，完成某些操作。。。");
        target.teach();
        System.out.println("提交。。。");
    }
}
