package com.tracy.pattern.state;

/**
 * created by huangyating
 *
 * @Date 2021/3/7
 */
public class Client {

    public static void main(String[] args) {
        //创建活动对象，奖品有1个
        RaffleActivity activity = new RaffleActivity(1);

        //我们连续抽奖30次
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i+1) + "次抽奖--------");

            //参加抽奖，第一步扣除积分
            activity.deductMoney();

            //第二步抽奖
            activity.raffle();
        }
    }
}
