package clocks;

import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        draw(arg);
    }

    private void draw(Object arg) {
        int[] timeArr = (int[]) arg;
        int hour = timeArr[0];
        int minute = timeArr[1];
        int second = timeArr[2];

        String time = ((hour < 10) ? "0" : "") + hour + ":" + ((minute < 10) ? "0" : "") + minute + ":" + ((second < 10) ? "0" : "") + second;

        System.out.println("Digital clock: " + time);
    }
}
