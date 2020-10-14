public class YearCheck {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
