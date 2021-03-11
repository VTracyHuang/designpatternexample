package com.tracy.pattern.iterator;

import java.util.Iterator;

/**
 * created by huangyating
 *
 * @Date 2021/2/24
 */
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要Department是以怎样的方式存放
    Department [] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //数组类型判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if(position >= departments.length||departments[position]==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    //删除的方法，默认空实现
    @Override
    public void remove() {

    }
}
