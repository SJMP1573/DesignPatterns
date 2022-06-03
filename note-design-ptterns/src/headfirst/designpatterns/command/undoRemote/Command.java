package headfirst.designpatterns.command.undoRemote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 18:58
 * @description:
 */

public interface Command {
    void execute();
    void undo();
}
