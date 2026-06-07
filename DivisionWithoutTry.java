class DivisionWithoutTry {
    public static void main(String[] args) {
        int a = 10, b = 0;  
        
        if (b != 0) {
            int result = a / b;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}