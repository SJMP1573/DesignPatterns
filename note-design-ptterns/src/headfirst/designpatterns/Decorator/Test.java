package headfirst.designpatterns.Decorator;

/**
 * @author: sjmp1573
 * @date: 2022/5/18 11:39
 * @description:
 */

public class Test {
    public static void main(String[] args) {

        // 创建 Beverage 饮料，不加配料。
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() +" " + espresso.cost());

        // 创建 DarkRoast 饮料，加配料 Mocha、Mocha、Whip。
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription()+ " " + darkRoast.cost());

        // 创建 HouseBlend 饮料，加配料 Soy、Mocha、Whip。
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription()+ " "+houseBlend.cost());
    }
}
