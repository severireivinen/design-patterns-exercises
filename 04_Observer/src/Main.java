import clocks.DigitalClock;

public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock();

        timer.addObserver(digitalClock);
        timer.tick();
    }
}
