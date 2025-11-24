package ua.opnu;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes >= 60) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    public double getTotalHours() {
        return Math.round((hours + minutes / 60.0) * 100.0) / 100.0;
    }

    public void add(int h, int m) {
        if (h < 0 || m < 0 || m >= 60) return;
        int total = getTotalMinutes() + h * 60 + m;
        hours = total / 60;
        minutes = total % 60;
    }

    public void addTimeSpan(TimeSpan other) {
        add(other.hours, other.minutes);
    }

    public void subtract(TimeSpan other) {
        int total = getTotalMinutes() - other.getTotalMinutes();
        if (total < 0) total = 0;
        hours = total / 60;
        minutes = total % 60;
    }

    public void scale(int factor) {
        if (factor <= 0) return;
        int total = getTotalMinutes() * factor;
        hours = total / 60;
        minutes = total % 60;
    }

    @Override
    public String toString() {
        return hours + " год " + minutes + " хв";
    }
}
