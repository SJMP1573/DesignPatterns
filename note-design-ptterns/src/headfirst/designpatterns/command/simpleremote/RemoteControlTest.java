package headfirst.designpatterns.command.simpleremote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 15:12
 * @description:
 */

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        remoteControl.setSlot(lightOnCommand);
        remoteControl.buttonWasPressed();

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        // 命令调用
        remoteControl.setSlot(garageDoorOpenCommand);
        // 命令接收 execute();
        remoteControl.buttonWasPressed();
    }
}
