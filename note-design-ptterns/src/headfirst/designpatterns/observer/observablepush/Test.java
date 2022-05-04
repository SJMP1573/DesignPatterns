package headfirst.designpatterns.observer.observablepush;

import java.util.Observer;

/**
 * @author: sjmp1573
 * @date: 2022/5/3 21:53
 * @description:
 */

public class Test {

    public static void main(String[] args) {

        WeChatPublicAccount weChatPublicAccount = new WeChatPublicAccount();

        Observer user1 = new User1(weChatPublicAccount);
        Observer user2 = new User2(weChatPublicAccount);
        Observer user3 = new User3(weChatPublicAccount);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

        weChatPublicAccount.setDataChanged("午觉睡多久比较好","丁香医生","午觉睡10-20mins是极好的，一觉醒来元气满满");

        System.out.println("丁香医生公众号数据更新后...");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

    }
}
