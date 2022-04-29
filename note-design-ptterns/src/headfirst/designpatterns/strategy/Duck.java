package headfirst.designpatterns.strategy;

/**
 * @author: sjmp1573
 * @date: 2022/4/29 10:43
 * @description:
 */

public abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
}
