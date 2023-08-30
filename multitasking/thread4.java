//This programe will run multiple thread method with single run method
package multitasking;

import java.util.Scanner;

class Mythread extends Thread {
    public void run() {
        String Tname = Thread.currentThread().getName();
        if (Tname.equals("Calc")) {
            Calc();
        } else {
            Message();
        }

    }

    public void Calc() {
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

    public void Message() {

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

public class thread4 {
    public static void main(String[] args) {
        Mythread Mt1 = new Mythread();
        Mythread Mt2 = new Mythread();
        Mt1.setName("Calc");
        Mt2.setName("Message");
        Mt1.start();
        Mt2.start();

    }
}
