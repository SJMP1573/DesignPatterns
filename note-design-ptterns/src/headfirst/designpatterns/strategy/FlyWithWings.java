package headfirst.designpatterns.strategy;

/**
 * @author: sjmp1573
 * @date: 2022/4/29 10:45
 * @description:
 */

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
