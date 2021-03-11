package com.tracy.pattern.state;

/**
 * created by huangyating
 *d
 * @Date 2021/3/7
 */
public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品送完了，请下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品送完了，请下次参加");

        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品送完了，请下次参加");

    }
}
