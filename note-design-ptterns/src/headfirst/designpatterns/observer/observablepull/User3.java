package headfirst.designpatterns.observer.observablepull;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: sjmp1573
 * @date: 2022/5/3 21:23
 * @description:
 */

public class User3 implements Observer {

    private String title;
    private String author;
    private String content;

    private Observable weChatPublicAccount;

    public User3(Observable weChatPublicAccount) {
        this.weChatPublicAccount = weChatPublicAccount;
        weChatPublicAccount.addObserver(this);
    }


    @Override
    public String toString() {
        return "User3{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public void update(Observable o, Object arg) {

        WeChatPublicAccount weChatPublicAccount = (WeChatPublicAccount) o;
        title = weChatPublicAccount.getTitle();
        author = weChatPublicAccount.getAuthor();
        content = weChatPublicAccount.getContent();
    }
}
