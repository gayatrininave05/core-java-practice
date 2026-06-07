public class Unary{
public static void main(String args[]){
int a = 10;
int b = -5;

//unary plus and minus
int add = +a;
int sub =-b;
 
//unary increament and decreament

int prei = ++a;
int posti = a++;
int pred = --a;
int postd = a--;

//logical not

Boolean not  = true;
Boolean not1 = !not;

System.out.println(add);
System.out.println(sub);
System.out.println(prei);
System.out.println(posti);
System.out.println(pred);
System.out.println(postd);
System.out.println(not1);
}
}
