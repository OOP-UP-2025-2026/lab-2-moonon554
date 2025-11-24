package ua.opnu;

public class TimeSpan {
    private double hours; // используем double для точности дробных часов

    public TimeSpan() {
        this.hours = 0;
    }

    public TimeSpan(double hours) {
        this.hours = hours;
    }

    public TimeSpan(int hours, int minutes) {
        this.hours = hours + minutes / 60.0;
    }

    public void add(TimeSpan other) {
        this.hours += other.hours;
    }

    public void add(double hours) {
        this.hours += hours;
    }

    public int getHours() {
        return (int) hours;
    }

    public int getMinutes() {
        return (int) Math.round((hours - getHours()) * 60);
    }

    @Override
    public String toString() {
        return getHours() + " год " + getMinutes() + " хв";
    }
}
