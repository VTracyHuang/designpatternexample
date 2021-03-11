package com.tracy.interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * created by huangyating
 *
 * @Date 2021/2/26
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("jack");
        //获取迭代器
        Iterator Itr = a.iterator();
        while (Itr.hasNext()){
            System.out.println(Itr.next());
        }
    }
}
