package headfirst.designpatterns.iterator.iteratormenu;


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
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        while (dinerMenuIterator.hasNext()){
            MenuItem menuItem = (MenuItem)dinerMenuIterator.next();
            printMenuItem(menuItem);
        }

        System.out.println("------------------------");

        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        while (pancakeHouseMenuIterator.hasNext()){
            MenuItem menuItem = (MenuItem)pancakeHouseMenuIterator.next();
            printMenuItem(menuItem);
        }
    }

    public void printMenuItem(MenuItem menuItem){
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }
}
