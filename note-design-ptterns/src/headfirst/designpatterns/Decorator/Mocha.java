package headfirst.designpatterns.Decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:24
 * @description:
 */

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
