import java.time.ZonedDateTime;

public class Clock {
    private static Clock INSTANCE = null;
    private ZonedDateTime time = null;

    private Clock() {
        this.time = ZonedDateTime.now();
    }

    public static Clock getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Clock();
        }
        return INSTANCE;
    }

    public ZonedDateTime getTime() {
        return time;
    }
}
