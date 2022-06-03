package headfirst.designpatterns.command.remote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 16:33
 * @description:
 */

public class LivingroomLightOffCommand implements Command {

    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
