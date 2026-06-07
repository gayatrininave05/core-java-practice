public class Logical{
public static void main(String args[]){
int a = 10;
int b = 15;

boolean and = (a>b && a< b);
boolean or = (a>b || a< b);
boolean not = !(a>b);

System.out.println(and);
System.out.println(or);
System.out.println(not);

}
}