package headfirst.designpatterns.observer.simple;

/**
 * @author: sjmp1573
 * @date: 2022/5/3 21:22
 * @description:
 */

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers();
}
