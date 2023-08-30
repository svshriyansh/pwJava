package multitasking;

import java.util.Scanner;

class calc extends Thread
{
    public void run()
    {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();
        }
        result = num1+num2;
        System.out.println("Result is "+ result);
    }
}

class Message extends Thread
{
    public void run()
    {
        try{

            for(int i =0;i<3;i++){
                System.out.println("Hello \n Focus is the key");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("Some error occured");
        }
    }
}
public class thread3 {
    public static void main(String[] args) {
        calc c = new calc();
        c.start();
        Message m = new Message();
        m.start();

    }
}
