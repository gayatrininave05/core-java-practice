public class Main{
public static void main(String args[]){
	int age = 12;
	Dog d1 = new Dog();
	d1.name ="Tony";
	d1.bark();

	Dog d2 = new Dog();
	d2.name = "new";
	d2.walk();
	
}
}

class Dog{
String name;
int age;
String color;
}

void walk(){
System.out.println("Dog is walking");
}
void bark(){
System.out.println("Dog ids barking");

}
class Cat{
}
