package headfirst.designpatterns.Decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:24
 * @description:
 */

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
