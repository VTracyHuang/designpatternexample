package com.tracy.pattern.iterator;

import java.util.Iterator;

/**
 * created by huangyating
 *
 * @Date 2021/2/24
 */
public class ComputerCollege implements College {
    Department [] departments;
    int numOfDepartment = 0; //保存当前数组的对象个数

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("java","java专业");
        addDepartment("php","php专业");
        addDepartment("c","c专业");
        addDepartment("js","js专业");
        addDepartment("大数据","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
