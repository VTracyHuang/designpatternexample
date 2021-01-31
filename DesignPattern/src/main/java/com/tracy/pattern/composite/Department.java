package com.tracy.pattern.composite;

/**
 * created by huangyating
 *
 * @Date 2021/1/31
 */
public class Department extends OrgnizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }

    //add,remove就不需要再写了，因为它是叶子节点，它不管理其他单位
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
    @Override
    protected void print() {
        System.out.println(getName());
    }
}


