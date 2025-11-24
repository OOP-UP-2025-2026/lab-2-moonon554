package ua.opnu;

public class TimeSpan {
    private double hours;
    private double minutes;

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public TimeSpan(double minutes) {
        this.hours = 0;
        this.minutes = minutes;
    }

    public int getHours() {
        return (int) hours;
    }

    public int getMinutes() {
        return (int) minutes;
    }

    public double getTotalMinutes() {
        return hours * 60 + minutes;
    }

    public void add(int hours, int minutes) {
        this.minutes += minutes;
        this.hours += hours + this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    public void add(TimeSpan other) {
        add((int) other.hours, (int) other.minutes);
    }

    @Override
    public String toString() {
        return (int) hours + " год " + (int) minutes + " хв";
    }
}
