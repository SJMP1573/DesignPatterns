package headfirst.designpatterns.observer.simple;

/**
 * @author: sjmp1573
 * @date: 2022/5/3 21:23
 * @description:
 */

public class User2 implements Observer {
    private String title;
    private String author;
    private String content;

    private Subject weChatPublicAccount;

    public User2(Subject weChatPublicAccount) {
        this.weChatPublicAccount = weChatPublicAccount;
        weChatPublicAccount.registerObserver(this);
    }

    @Override
    public void update(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    @Override
    public String toString() {
        return "User2{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
