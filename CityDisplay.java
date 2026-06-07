public class CityDisplay {

    void display() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Delhi is an Important City");
        }
    }
    void display(String city) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Bombay is a beautiful city");
        }
    }

    void display(String city, int times) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Chennai is a peaceful city");
        }
    }

    public static void main(String[] args) {
        CityDisplay obj = new CityDisplay();

        obj.display();               
        obj.display("Bombay");       
        obj.display("Chennai", 4);    
    }
}
