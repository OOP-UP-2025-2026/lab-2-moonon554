package ua.opnu;

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

    public TimeSpan(int minutes) {
        this.hours = minutes / 60;
        this.minutes = minutes % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void add(int hours, int minutes) {
        int total = this.hours * 60 + this.minutes + hours * 60 + minutes;
        this.hours = total / 60;
        this.minutes = total % 60;
    }

    public void add(TimeSpan other) {
        add(other.hours, other.minutes);
    }

    @Override
    public String toString() {
        return hours + " год " + minutes + " хв";
    }
}
