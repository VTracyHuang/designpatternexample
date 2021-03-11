package com.tracy.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2021/2/23
 */
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new LinkedList<>();
    
    //增加到list
    public void attach(Person p){
        persons.add(p);
    }
    //移除
    public void detacch(Person p){
        persons.remove(p);
    }
    //显示测评情况
    public void display(Action action){
        for (Person p:persons) {
            p.accept(action);
        }
    }
}
