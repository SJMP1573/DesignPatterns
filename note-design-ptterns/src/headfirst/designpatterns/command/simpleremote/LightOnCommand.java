package headfirst.designpatterns.command.simpleremote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 15:06
 * @description:
 */

public class LightOnCommand implements Command{
    
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
