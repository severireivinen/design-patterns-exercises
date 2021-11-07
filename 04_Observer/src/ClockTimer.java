import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Observable;

public class ClockTimer extends Observable {

    void tick() {
        while (true) {

            int[] time = getTime();

            setChanged();
            notifyObservers(time);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private int[] getTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        int hour = zonedDateTime.getHour();
        int minute = zonedDateTime.getMinute();
        int second = zonedDateTime.getSecond();

        int[] timeInArray = {hour, minute, second};

        return timeInArray;
    }
}
