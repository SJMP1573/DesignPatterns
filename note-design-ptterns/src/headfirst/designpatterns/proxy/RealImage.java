package headfirst.designpatterns.proxy;

/**
 * @author: sjmp1573
 * @date: 2022/6/7 20:56
 * @description:
 */

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying"+fileName);
    }
    private void loadFromDisk(String fileName){
        System.out.println("Loading"+fileName);
    }
}
