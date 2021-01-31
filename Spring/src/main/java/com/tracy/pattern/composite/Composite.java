package com.tracy.pattern.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * created by huangyating
 *
 * @Date 2021/1/31
 */
public class Composite {
    public static void main(String[] args) {

        //说明
        //1.Map就是一个抽象的构建（类似于我们的Component）
        //2.HashMap是一个中间的构建(Composite),实现/继承了相关方法
        //put , putAll
        //3.Node是HashMap的静态内部类，类似于Leaf叶子节点，这里就没有put,putAll
        // static class Node<K,V> implements Map.Entry<K,V>
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "三国演义");
        Map<Integer, String> map = new HashMap<>();
        hashMap.put(1, "红楼梦");
        hashMap.put(2, "西游记");
        hashMap.putAll(map);
        System.out.println(hashMap);
    }
}
