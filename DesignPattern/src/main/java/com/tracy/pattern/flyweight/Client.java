package com.tracy.pattern.flyweight;

/**
 * created by huangyating
 *
 * @Date 2021/2/1
 */
public class Client {

    public static void main(String[] args) {

        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要一个以新闻形式发布的网站
        Website webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("Tom"));

        //客户要一个以博客形式发布的网站
        Website webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("Marry"));

        //客户要一个以博客形式发布的网站
        Website webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("Jack"));

        //客户要一个以博客形式发布的网站
        Website webSite4 = webSiteFactory.getWebSiteCategory("博客");
        webSite4.use(new User("Smith"));

        System.out.println("网站的类型共有：" + webSiteFactory.getWebSiteCount() + "种");
    }
}
