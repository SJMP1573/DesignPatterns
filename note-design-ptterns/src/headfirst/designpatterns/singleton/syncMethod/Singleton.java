package headfirst.designpatterns.singleton.syncMethod;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 10:31
 * @description:
 */

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
