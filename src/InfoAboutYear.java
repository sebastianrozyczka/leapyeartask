public class InfoAboutYear {
    public static void main(String[] args) {
        YearCheck yearCheck = new YearCheck();
        int year = 2020;

        System.out.println("Czy rok " + year + " jest przestępny? " + yearCheck.isLeap(year));
    }
}
