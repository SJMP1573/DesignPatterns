package headfirst.designpatterns.Decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:22
 * @description:
 */

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
