package headfirst.designpatterns.command.undoRemote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 19:33
 * @description:
 */

public class RemoteControlTest {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingLight = new Light("living");
        CeilingFan ceilingFan = new CeilingFan("");

        LightOnCommand livingLightOnCommand = new LightOnCommand(livingLight);
        LightOffCommand livingLightOffCommand = new LightOffCommand(livingLight);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommands(0,livingLightOnCommand,livingLightOffCommand);
        remoteControl.setCommands(1,ceilingFanHighCommand,ceilingFanOffCommand);
        remoteControl.setCommands(2,ceilingFanMediumCommand,ceilingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.onCommandButtonWasPreesed(0);
        remoteControl.offCommandButtonWasPreesed(0);
        remoteControl.undoCommand.undo();

        remoteControl.onCommandButtonWasPreesed(1);
        remoteControl.offCommandButtonWasPreesed(1);
        remoteControl.undoCommand.undo();

        remoteControl.onCommandButtonWasPreesed(2);
        remoteControl.offCommandButtonWasPreesed(2);
        remoteControl.undoCommand.undo();


    }
}
