import java.util.Scanner;

public class Square {
    public static void main(String args[]) {

	double side,area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
         side = sc.nextDouble();

         area = side * side;

        System.out.println("The area of the square is: " + area);


    }
}

