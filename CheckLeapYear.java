public class LeapYear{
public static boolean is LeapYear(int year){
if((year%4==0 && year % 100 !=0)||(year %400 == 0){
return true;
}else{
return false;
}

public static String CheckLeapYear(int year){
boolean result = intLeapYear(year){
if(result)
return year + "is a Leap Year.";
else
return year + "is Not a leap Year.";
}

public static void main(String args []){
int year = 2024;
String massage = checkLeapYear(year);
System.out.println(massage);
}
}