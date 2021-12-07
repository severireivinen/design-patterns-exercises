import prototype.Clock;

public class Main {
    public static void main(String[] args) {
        Clock clock1 = new Clock(1, 12);
        Clock clock2 = clock1.clone();

        System.out.println("Clock 1 time is: " + clock1);
        System.out.println("Clock 2 time is: " + clock2);

        clock2.getHours().setValue(3);
        clock2.getMinutes().setValue(45);

        System.out.println("Clock 1 time is: " + clock1);
        System.out.println("Clock 2 time is: " + clock2);
    }
}
