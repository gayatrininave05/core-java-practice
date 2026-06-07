interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {

    public void print() {
        System.out.println("This is print method from Printable interface.");
    }

    public void show() {
        System.out.println("This is show method from Showable interface.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print();
        obj.show();
    }
}
