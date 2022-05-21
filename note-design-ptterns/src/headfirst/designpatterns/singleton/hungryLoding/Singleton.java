package headfirst.designpatterns.singleton.hungryLoding;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 10:35
 * @description:
 */

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return uniqueInstance;
    }
}
