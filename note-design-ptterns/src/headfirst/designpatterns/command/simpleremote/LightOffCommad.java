package headfirst.designpatterns.command.simpleremote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 15:08
 * @description:
 */

public class LightOffCommad implements Command {

    Light light;

    public LightOffCommad(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
