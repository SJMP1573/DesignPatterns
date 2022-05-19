package headfirst.designpatterns.decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:20
 * @description:
 */

public abstract class Beverage {

    // 每种饮料的描述：“名称，配料1，配料2...”
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    // 每种类型饮料的价格不同，故定义为抽象方法
    public abstract double cost();
}
