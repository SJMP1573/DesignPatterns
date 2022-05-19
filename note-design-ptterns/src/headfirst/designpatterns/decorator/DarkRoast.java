package headfirst.designpatterns.decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:22
 * @description:
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
