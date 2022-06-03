package headfirst.designpatterns.command.simpleremote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 15:16
 * @description:
 */

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
