package headfirst.designpatterns.proxy;

/**
 * @author: sjmp1573
 * @date: 2022/6/7 20:59
 * @description:
 */

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
