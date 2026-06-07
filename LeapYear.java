public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

public static String LeapYear(int year) {
        boolean result = isLeapYear(year);
        if (result)
            return year + " is a Leap Year.";
        else
            return year + " is Not a Leap Year.";
    }

 public static void main(String args[]) {
        int year = 2024;
        String message = LeapYear(year);
        System.out.println(message);
    }
}
