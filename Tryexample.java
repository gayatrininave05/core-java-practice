public class Tryexample {
    public static void main(String[] args) {
        try {
            int num = 10 / 2; // No exception here
            System.out.println("Result: " + num);
        }
        catch (ArithmeticException e) {
            System.out.println("Error occurred.");
        }
        finally {
            System.out.println("Finally block always runs.");
        }
    }
}
