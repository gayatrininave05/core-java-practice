import java.util.Scanner;

class Triangle {
    double area;


    Triangle(double base, double height) {
        area = 0.5 * base * height;
    }

    Triangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double getArea() {
        return area;
    }
}

public class TriangleAre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        Triangle t1 = new Triangle(base, height);
        System.out.println("Area of Triangle (Base & Height): " + t1.getArea());


        System.out.print("\nEnter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        Triangle t2 = new Triangle(a, b, c);
        System.out.println("Area of Triangle (Three Sides): " + t2.getArea());
    }
}

