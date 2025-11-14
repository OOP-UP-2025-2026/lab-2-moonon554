class TimeSpan {

    private int hours;
    private int minutes;

    TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    int getHours() {
        return hours;
    }

    int getMinutes() {
        return minutes;
    }

    void add(int h, int m) {
        if (h < 0 || m < 0 || m > 59) return;

        int total = hours * 60 + minutes + h * 60 + m;
        hours = total / 60;
        minutes = total % 60;
    }

    void addTimeSpan(TimeSpan span) {
        add(span.hours, span.minutes);
    }

    double getTotalHours() {
        return hours + minutes / 60.0;
    }

    int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    void subtract(TimeSpan span) {
        int t1 = getTotalMinutes();
        int t2 = span.getTotalMinutes();

        if (t2 > t1) return;

        int result = t1 - t2;
        hours = result / 60;
        minutes = result % 60;
    }

    void scale(int factor) {
        if (factor <= 0) return;

        int total = getTotalMinutes() * factor;
        hours = total / 60;
        minutes = total % 60;
    }
}
