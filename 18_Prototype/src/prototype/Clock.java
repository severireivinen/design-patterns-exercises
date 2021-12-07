package prototype;

public class Clock implements Cloneable {
    private Pointer hours;
    private Pointer minutes;

    public Clock(int hours, int minutes) {
        this.hours = new Pointer(hours);
        this.minutes = new Pointer(minutes);
    }

    public Pointer getHours() {
        return hours;
    }

    public Pointer getMinutes() {
        return minutes;
    }

    public Clock clone() {
        Clock c = null;
        try {
            c = (Clock) super.clone();
            c.hours = (Pointer) hours.clone();
            c.minutes = (Pointer) minutes.clone();
        } catch (CloneNotSupportedException e) {
        }
        return c;
    }

    public String toString() {
        return hours.getValue() + ":" + minutes.getValue();
    }
}
