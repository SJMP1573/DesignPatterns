package headfirst.designpatterns.observer.observablepush;

import java.util.HashMap;
import java.util.Observable;

/**
 * @author: sjmp1573
 * @date: 2022/5/3 21:22
 * @description:
 */

public class WeChatPublicAccount extends Observable {

    private String title;
    private String author;
    private String content;
    private HashMap<String, String> dataMap;

    public WeChatPublicAccount() {
        dataMap = new HashMap<>();
    }

    // 将数据封装至 map，然后以 “推” 的方式将数据通知所有观察者。
    public void dataChanged() {
        setChanged();
        dataMap.put("title", title);
        dataMap.put("author", author);
        dataMap.put("content", content);
        notifyObservers(dataMap);
    }

    public void setDataChanged(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
        dataChanged();
    }

}
