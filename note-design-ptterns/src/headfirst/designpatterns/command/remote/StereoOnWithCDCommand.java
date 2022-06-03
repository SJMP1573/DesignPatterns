package headfirst.designpatterns.command.remote;

/**
 * @author: sjmp1573
 * @date: 2022/4/23 16:30
 * @description:
 */

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
