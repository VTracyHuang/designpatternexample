package com.tracy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * created by huangyating
 *
 * @Date 2021/3/5
 */
public class Stratege {

    public static void main(String[] args) {
        //数组
        Integer [] data = {9,1,2,8,4,3};

        //实现升序排序，返回-1放左边，1，放右边，0保持不变

        //说明
        //1.实现Comparator接口，匿名类对象 new Comparator<Integer>(){...}
        //3.public int compare(Integer o1,Integer o2){}指定具体的处理方法
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if(o1 > o2){
                   return 1;
               }else{
                   return -1;
               }
            }
        };
        /*
         public static <T> void sort(T[] a, Comparator<? super T> c) {
            if (c == null) {
                sort(a);
            } else {
                if (LegacyMergeSort.userRequested)
                    legacyMergeSort(a, c);
                else
                    TimSort.sort(a, 0, a.length, c, null, 0, 0);
            }
        }
         */
        Arrays.sort(data,comparator);
        System.out.println(Arrays.toString(data));


        //方式2- 同时lambda表达式实现
        Integer [] data2 = {19,11,12,18,14,13};
        Arrays.sort(data2,(var1,var2)->{
            if(var1.compareTo(var2) > 0){
                return 1;
            }else{
                return -1;
            }
        });
        System.out.println("data2=" + Arrays.toString(data2));
    }
}
