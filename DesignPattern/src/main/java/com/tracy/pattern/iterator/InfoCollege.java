package com.tracy.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2021/2/24
 */
public class InfoCollege implements College {

    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息安全","信息安全专业");
        addDepartment("网络安全","网络安全专业");
        addDepartment("服务器安全","服务器安全专业");

    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return null;
    }
}
