package multitasking;

import java.util.Scanner;

class calc implements Runnable {
    public void run() {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();
        }
        result = num1 + num2;
        System.out.println("Result is " + result);
    }
}

class Message implements Runnable {
    public void run() {
        try {

            for (int i = 0; i < 3; i++) {
                System.out.println("Hello \n Focus is the key");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some error occured");
        }
    }
}

public class threadRunnable {
    public static void main(String[] args) {
        calc c = new calc();
        Message m = new Message();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();

    }
}