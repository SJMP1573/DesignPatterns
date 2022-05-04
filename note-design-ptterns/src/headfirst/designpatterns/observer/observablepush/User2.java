package headfirst.designpatterns.observer.observablepush;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * @author: sjmp1573
 * @date: 2022/5/3 21:23
 * @description:
 */

public class User2 implements Observer {

    private String title;
    private String author;
    private String content;

    private Observable weChatPublicAccount;

    public User2(Observable weChatPublicAccount) {
        this.weChatPublicAccount = weChatPublicAccount;
        weChatPublicAccount.addObserver(this);
    }


    @Override
    public String toString() {
        return "User2{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public void update(Observable o, Object arg) {
        HashMap<String,String> dataMap = (HashMap<String, String>) arg;
        title = dataMap.get("title");
        author = dataMap.get("author");
        content = dataMap.get("content");
    }
}
