package headfirst.designpatterns.command.undoRemote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 19:32
 * @description:
 */

public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;

    int prevCommand;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevCommand = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (prevCommand == CeilingFan.HIGH){
            ceilingFan.high();
        }else if (prevCommand == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if (prevCommand == ceilingFan.LOW){
            ceilingFan.low();
        }else{
            ceilingFan.off();
        }
    }
}
