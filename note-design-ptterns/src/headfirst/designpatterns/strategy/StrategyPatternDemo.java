package headfirst.designpatterns.strategy;

/**
 * @author: sjmp1573
 * @date: 2022/4/29 10:59
 * @description:
 */

public class StrategyPatternDemo {

    public static void main(String[] args) {
        FlyBehavior flyNoWay = new FlyNoWay();
        Duck modelDuck = new ModelDuck();
        // 为模型鸭注入飞行行为，即无法飞行；
        modelDuck.setFlyBehavior(flyNoWay);
        modelDuck.display();
        modelDuck.performFly();
        System.out.println("------------");

        //运行时，动态改变模型鸭的飞行行为，利用火箭驱动飞行
        FlyRocketPowered flyRocketPowered = new FlyRocketPowered();
        modelDuck.setFlyBehavior(flyRocketPowered);
        modelDuck.display();
        modelDuck.performFly();
        System.out.println("------------");

        // 创建一只橡皮鸭，复用方法
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(flyNoWay);
        rubberDuck.display();
        rubberDuck.performFly();
    }
}
