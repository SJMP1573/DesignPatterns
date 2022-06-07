package headfirst.designpatterns.proxy;

/**
 * @author: sjmp1573
 * @date: 2022/6/7 20:58
 * @description:
 */

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }

        // 可补充代码，进行功能增强
        realImage.display();
        // 可补充代码，进行功能增强
    }
}
