import java.awt.*;

public class AutoClicker {

   private Robot robot;
   private int delay;

    public AutoClicker() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        delay=300;
    }

    public void mousePress(int button){
        try {
            robot.mousePress(button);
            robot.delay(250);
            robot.mouseRelease(button);
            robot.delay(delay);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
}
