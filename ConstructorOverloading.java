
class StudentData {
    String name;
    int age;

    
    StudentData() {
        name = "Unknown";
        age = 0;
    }

    StudentData(String n) {
        name = n;
        age = 18; 
    }


    StudentData(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentData {
    public static void main(String[] args) {
        StudentData s1 = new Student();                 
        StudentData s2 = new Student("Kirti");          
        StudentData s3 = new Student("Gayatri", 21);     

        s1.display();
        s2.display();
        s3.display();
    }
}

