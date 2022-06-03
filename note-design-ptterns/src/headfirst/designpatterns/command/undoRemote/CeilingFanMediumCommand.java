package headfirst.designpatterns.command.undoRemote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 19:29
 * @description:
 */

public class CeilingFanMediumCommand implements Command {

    CeilingFan ceilingFan;

    int prevCommand;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevCommand = ceilingFan.getSpeed();
        ceilingFan.medium();
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
