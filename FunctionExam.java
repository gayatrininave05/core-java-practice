class FunctionExam{
    int x;
    int y;
void fun1 (){
    System.out.println("fun1");

}
void fun2(){
    System.out.println("fun2");
}  
}

class object1 {
    public static void main(String args[]) {
        FunctionExam m1 = new FunctionExam();
        FunctionExam m2 = new FunctionExam();
        System.out.println("hello0");
        System.out.println(m2.x);
    }

}
