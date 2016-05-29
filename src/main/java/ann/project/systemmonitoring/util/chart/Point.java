package ann.project.systemmonitoring.util.chart;

public class Point {
    private String time = "";
    private Integer y = 0;
    private Integer number = 0;
    public int hour;
    public int minute;
    public int secunde;

    public int getSecunde() {
        return secunde;
    }

    public void setSecunde(int secunde) {
        this.secunde = secunde;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Point(String time, Integer y) {
        this.time = time;
        this.y = y;
        hour = Integer.valueOf(time.substring(11, 13));
        minute = Integer.valueOf(time.substring(14, 16));
        secunde = Integer.valueOf(time.substring(17, 19));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (time != null ? !time.equals(point.time) : point.time != null) return false;
        return y != null ? y.equals(point.y) : point.y == null;

    }

    @Override
    public int hashCode() {
        int result = time != null ? time.hashCode() : 0;
        result = 31 * result + (y != null ? y.hashCode() : 0);
        return result;
    }
}
