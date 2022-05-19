package headfirst.designpatterns.decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:24
 * @description:
 */

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
