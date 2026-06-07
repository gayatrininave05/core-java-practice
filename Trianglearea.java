import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
	double a,b,c,s,area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
         a = sc.nextDouble();

        System.out.println("Enter Number: ");
         b = sc.nextDouble();

        System.out.println("Enter Number: ");
         c = sc.nextDouble();
 	
	s =(a+b+c)/2;
	area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	

        System.out.println("Area = " + area);
    }
}
