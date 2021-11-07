package clocks;

import java.util.Observable;
import java.util.Observer;

public class AnalogClock implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        draw(arg);
    }

    private void draw(Object arg) {
        int[] timeArr = (int[]) arg;
        int hour = timeArr[0];
        int minute = timeArr[1];
        int second = timeArr[2];

        // TODO
        System.out.println("Analog clock: ");
    }
}
