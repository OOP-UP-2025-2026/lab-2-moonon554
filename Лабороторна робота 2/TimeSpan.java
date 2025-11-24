import java.util.Scanner;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int hours, int minutes) {
        this.hours = hours + minutes / 60;
        this.minutes = minutes % 60;
    }

    public void addHours(int hours) {
        this.hours += hours;
    }

    public void addMinutes(int minutes) {
        this.hours += minutes / 60;
        this.minutes += minutes % 60;
    }

    public void addTimeSpan(TimeSpan other) {
        addHours(other.hours);
        addMinutes(other.minutes);
    }

    @Override
    public String toString() {
        return hours + " год " + minutes + " хв";
    }

    // Метод для створення TimeSpan через введення користувача
    public static TimeSpan createFromInput(Scanner sc) {
        System.out.print("Введіть години: ");
        int h = Integer.parseInt(sc.nextLine());
        System.out.print("Введіть хвилини: ");
        int m = Integer.parseInt(sc.nextLine());
        return new TimeSpan(h, m);
    }
}
