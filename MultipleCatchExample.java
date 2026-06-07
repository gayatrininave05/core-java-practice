public class MultipleCatchExample {
    public static void main(String args[]) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; 

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); 
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound Exception Occurred: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("General Exception Occurred: " + e.getMessage());
        }

        System.out.println("Program Continues Normally");
    }
}
