package com.tracy.pattern.composite;

/**
 * created by huangyating
 *
 * @Date 2021/1/31
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象 学校
        University university = new University("清华大学","中国顶级大学");


        //创建学院
        College computerColleage = new College("计算机学院", "计算机学院");
        College artColleage = new College("美术学院", "美术学院");

        //创建各个学院下面的系（专业）
        computerColleage.add(new Department("软件工程","软件工程不错"));
        computerColleage.add(new Department("网络工程","网络工程不错"));
        computerColleage.add(new Department("计算机科学与技术","计算机科学与技术不错"));

        artColleage.add(new Department("视觉传达","视觉传达不错"));
        artColleage.add(new Department("设计学","设计学不错"));

        //将两个学院加入学校中
        university.add(computerColleage);
        university.add(artColleage);

        university.print();

    }
}
