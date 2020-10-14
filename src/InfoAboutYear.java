public class InfoAboutYear {
    public static void main(String[] args) {
        YearCheck yearCheck = new YearCheck();

        yearCheck.setYear(2080);
        System.out.println("Czy rok " + yearCheck.getYear() + " jest przestępny? " + yearCheck.isLeap(yearCheck.getYear()));
    }
}
