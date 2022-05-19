package headfirst.designpatterns.decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:21
 * @description:
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend ";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
