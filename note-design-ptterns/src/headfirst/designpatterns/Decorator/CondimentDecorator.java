package headfirst.designpatterns.Decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:23
 * @description: 因为对饮料附加配料后，其本质上还是一种饮料，所以让 CondimentDecorator 继承 Beverage，这也方便后续再附加配料。
 */

public abstract class CondimentDecorator extends Beverage {

    // 因为每种配料对饮料的描述进行了附加的说明，所以每种饮料添加配料后，都需要重写 getDescription方法。
    @Override
    public abstract String getDescription();

}
