package headfirst.designpatterns.command.remote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 16:27
 * @description:
 */

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
