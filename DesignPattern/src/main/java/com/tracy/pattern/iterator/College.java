package com.tracy.pattern.iterator;

import java.util.Iterator;

/**
 * created by huangyating
 *
 * @Date 2021/2/24
 */
public interface College {

    String getName();

    //增加系的方法
    void addDepartment(String name, String desc);

    //返回一个迭代器，遍历
    Iterator createIterator();
}
