package headfirst.designpatterns.strategy;

/**
 * @author: sjmp1573
 * @date: 2022/4/29 10:53
 * @description: 新增一种火箭驱动的飞行行为，利用策略模式的可扩展性好，也便于维护
 */

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
