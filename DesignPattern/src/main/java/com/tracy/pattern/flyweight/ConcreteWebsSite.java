package com.tracy.pattern.flyweight;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
//具体网站
public class ConcreteWebsSite extends Website {

    //共享的部分（内部状态）
    private String type = ""; // 网站发布的形式（类型）

    //构造器
    public ConcreteWebsSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布形式为：" + type +";" + user.getName() +"在使用中。。。");
    }
}
