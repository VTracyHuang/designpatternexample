package com.tracy.pattern.state;

import java.util.Random;

/**
 * created by huangyating
 *
 * @Date 2021/3/7
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已经扣除了积分，不能再扣了
    @Override
    public void deductMoney() {
        System.out.println("已经扣了积分了");
    }

    //可以抽奖了，抽完奖后，根据实际情况，改成新的状态
    @Override
    public boolean raffle() {

        System.out.println("正在抽奖，请稍等");
        Random r = new Random();
        int num = r.nextInt(10);
        //10%的中奖机会
        if(num == 0){
            //改变活动状态为发放奖品 context
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾没有抽中奖品");
            //改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    //不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
