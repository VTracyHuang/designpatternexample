package com.tracy.pattern.composite;

/**
 * created by huangyating
 *
 * @Date 2021/1/31
 */
public abstract class OrgnizationComponent {

    private String name;  //名字
    private String des;   //说明

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    //构造器
    public OrgnizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrgnizationComponent orgnizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }
    protected void remove(OrgnizationComponent orgnizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }
    //方法print,做成抽象的
    protected abstract void print();
}
