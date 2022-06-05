package headfirst.designpatterns.iterator.generalmenu;

import java.util.List;

/**
 * @author: sjmp1573
 * @date: 2022/6/5 10:45
 * @description: 客户代码
 */

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        List<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }

        System.out.println("-------------------------------");

        MenuItem[] lunchItems = ((DinerMenu) dinerMenu).getMenuItems();
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }


}
