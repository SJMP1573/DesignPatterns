package headfirst.designpatterns.composite;

/**
 * @author: sjmp1573
 * @date: 2022/6/5 17:34
 * @description:
 */

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
