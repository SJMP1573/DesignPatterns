package headfirst.designpatterns.singleton.doubleCheckedLocking;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 10:24
 * @description: double-checked locking
 */

public class Singleton {

    private static volatile Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized(Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
