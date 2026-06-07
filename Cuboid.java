class Cuboid {
    double length, breadth, height;

    
    Cuboid(double side) {
        length = side;
        breadth = side;
        height = side;
    }

   
    Cuboid(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

   
    Cuboid(double l, double b) {
        length = l;
        breadth = b;
        height = 1;
    }

  
    double area() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
}

public class CuboidAreaCalculator {
    public static void main(String[] args) {

        Cuboid cube = new Cuboid(5);             
        System.out.println("Area of Cube: " + cube.area());

        Cuboid cuboid = new Cuboid(4, 6, 3);    
        System.out.println("Area of Cuboid: " + cuboid.area());

        Cuboid defaultCuboid = new Cuboid(7, 2);  
        System.out.println("Area with Default Height: " + defaultCuboid.area());
    }
}
