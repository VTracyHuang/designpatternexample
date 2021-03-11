package com.tracy.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2021/2/24
 */
public class OutputImpl {

    //学院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList){
        super();
        this.collegeList = collegeList;
    }

    //遍历所有学院，然后调用printDepartment输出各个学院的系
    public void printCollege(){
        //从collegeList取出所有学院，java中List已经实现iterator接口
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("====="+college.getName()+"=====");
            printDepartment(college.createIterator());
        }
    }
    //输出 学院输出系
    public void printDepartment(Iterator iterator){
        while ((iterator.hasNext())){
            Department d = (Department)iterator.next();
            System.out.println(d.getName());
        }
    }
}
