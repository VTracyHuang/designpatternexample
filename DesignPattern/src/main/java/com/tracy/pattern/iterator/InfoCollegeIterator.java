package com.tracy.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2021/2/24
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList; //信息工程学院是以List方式存放系
    int index = -1; //索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1){
            return false;
        }else{
            index+=1;
            return true;
        }
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
