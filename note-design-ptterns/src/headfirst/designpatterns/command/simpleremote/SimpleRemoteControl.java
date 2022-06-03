package headfirst.designpatterns.command.simpleremote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 15:10
 * @description:
 */

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
