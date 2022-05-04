package headfirst.designpatterns.observer.simple;

import java.util.ArrayList;

/**
 * @author: sjmp1573
 * @date: 2022/5/3 21:22
 * @description:
 */

public class WeChatPublicAccount implements Subject {

    private ArrayList<Observer> observersList;

    private String title;
    private String author;
    private String content;

    public WeChatPublicAccount() {
        observersList = new ArrayList<>();
    }

    public ArrayList<Observer> getObserversList() {
        return observersList;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer != null) observersList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = -1;
        if (observer != null)
            index = observersList.indexOf(observer);
        if (index != -1)
            observersList.remove(index);
    }

    // 数据由主题由 “推” 的方式通知观察者
    @Override
    public void notifyAllObservers() {
        for (Observer o : observersList) {
            if (o != null)
                o.update(title, author, content);
        }
    }

    public void dataChanged() {
        notifyAllObservers();
    }

    public void setDataChanged(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
        dataChanged();
    }

}
