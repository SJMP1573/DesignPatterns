package headfirst.designpatterns.command.undoRemote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 18:59
 * @description:
 */

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        NoCommand noCommand = new NoCommand();
        undoCommand = noCommand;
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommands(int location,Command onCommand,Command offCommand){
        onCommands[location] = onCommand;
        offCommands[location] = offCommand;
    }

    public void onCommandButtonWasPreesed(int location){
        onCommands[location].execute();
        undoCommand = onCommands[location];
    }

    public void offCommandButtonWasPreesed(int location){
        offCommands[location].execute();
        undoCommand = offCommands[location];
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
