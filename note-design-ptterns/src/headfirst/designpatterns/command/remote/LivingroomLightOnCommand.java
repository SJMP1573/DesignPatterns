package headfirst.designpatterns.command.remote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 16:34
 * @description:
 */

public class LivingroomLightOnCommand implements Command {

    Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
