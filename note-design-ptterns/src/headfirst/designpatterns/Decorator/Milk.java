package headfirst.designpatterns.Decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:23
 * @description:
 */

public class Milk extends CondimentDecorator {

    // 关联了一种饮料，以便对附加新的行为
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    // 附加新的行为,描述
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Milk";
    }
    // 附加新的行为,价格
    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
