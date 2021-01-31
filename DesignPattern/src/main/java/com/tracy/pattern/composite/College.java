package com.tracy.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2021/1/31
 */
public class College extends OrgnizationComponent {

    //List中存放的是Department
    List<OrgnizationComponent> orgnizationComponentList = new ArrayList<>();

    //构造器
    public College(String name, String des) {
        super(name, des);
    }

    //重写add
    @Override
    protected void add(OrgnizationComponent orgnizationComponent) {
        //将来实际业务中，Colleage的add和University的add不一定完全一样
        orgnizationComponentList.add(orgnizationComponent);
    }

    //重写remove
    @Override
    protected void remove(OrgnizationComponent orgnizationComponent) {
        orgnizationComponentList.remove(orgnizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //print方法，就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("-----------" + getName() + "-------------");
        //遍历OrgnizationComponents
        for (OrgnizationComponent orgnizationComponent : orgnizationComponentList) {
            orgnizationComponent.print();
        }
    }
}
