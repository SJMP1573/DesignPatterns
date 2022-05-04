package headfirst.designpatterns.observer.observablepull;

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

    public WeChatPublicAccount() {

    }

    // 通知所有观察者，可以通过 “拉” 的方式获取自己所需的数据。
    public void dataChanged() {
        setChanged();
        notifyObservers();
    }

    public void setDataChanged(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
        dataChanged();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
