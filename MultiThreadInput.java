import java.lang.*;
public class Employee{
private int id;
private String name;
private String department;
private double salary;

public Employee(){
this.id = 0;
this.name ="unknown";
this.name ="Not Assign";
this.salary =0.0;
}

public Employee(int id, String name,String department,double salary){
this.id = id;
this.name =name;
this.department = department;
this.salary = salary;
}

public void displayDetail(){
System.out.println("Employee ID:" +id);
System.out.println("Employee name :" +name);
System.out,println("Department:" +department);
System.out.println("Salary:" +
salary);

public static void main(String [] args){
Employee emp1 = new Employee ();
System.out.println();

Employee emp2 = new Employee(101,"Gayatri Ninave","MCA",75000.50);
System.out.println("Employee Details(Parameterized Constructer):");
emp2.displayDetails();
}
}
