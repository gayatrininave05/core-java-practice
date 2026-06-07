import java.util.Scanner;
class MyThread extends Thread {
    int num;

    MyThread(int n) {
        num = n;
    }

    public void run() {
        System.out.println("Thread for number " + num + " is running");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + num + " -> Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadInputt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Creating thread objects
        MyThread t1 = new MyThread(a);
        MyThread t2 = new MyThread(b);

        t1.start();
        t2.start();
    }
}
