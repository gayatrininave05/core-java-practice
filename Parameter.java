public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private double perimeter;


    public Triangle(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
        this.perimeter = s1 + s2 + s3;
    }


    public Triangle(double equalSide, double base) {
        this.side1 = equalSide;
        this.side2 = equalSide;
        this.side3 = base;
        this.perimeter = 2 * equalSide + base;
    }

   
    public Triangle(double side) {
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
        this.perimeter = 3 * side;
    }

 
    public void displayPerimeter() {
        System.out.println("Triangle with sides: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("The perimeter is: " + perimeter + "\n");
    }
}


public class Parameter{
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);   
        Triangle t2 = new Triangle(5, 8);      
        Triangle t3 = new Triangle(6);         

        t1.displayPerimeter();
        t2.displayPerimeter();
        t3.displayPerimeter();
    }
}
