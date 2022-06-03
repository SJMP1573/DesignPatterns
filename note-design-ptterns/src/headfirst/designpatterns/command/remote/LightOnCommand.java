package headfirst.designpatterns.command.remote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 16:28
 * @description:
 */

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
