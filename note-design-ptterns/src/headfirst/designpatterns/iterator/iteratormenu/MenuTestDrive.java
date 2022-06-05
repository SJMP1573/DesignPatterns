package headfirst.designpatterns.iterator.iteratormenu;

/**
 * @author: sjmp1573
 * @date: 2022/6/5 11:44
 * @description:
 */

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu breakfastMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(breakfastMenu, dinerMenu);
        waitress.printMenu();
    }
}
