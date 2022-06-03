package headfirst.designpatterns.command.undoRemote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 19:14
 * @description:
 */

public class CeilingFanHighCommand implements Command{

    CeilingFan ceilingFan;

    int prevCommand;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevCommand = ceilingFan.getSpeed();
        ceilingFan.high();
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
