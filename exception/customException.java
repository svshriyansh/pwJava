package exception;

import java.util.Scanner;

class MyException extends Exception
{
    public MyException(){}

    public MyException(String msg)
    {
        super(msg);
    }
}
public class customException {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        try {
            num2 = sc.nextInt();
            if(num2<0)
            {
                Exception e = new MyException("Negative number is not valid");
                throw e;
            }
            else{
                result = num1/num2;
            }
        } catch (Exception e) {
            System.out.println("Invalid number"+e);
        }
        finally{
            sc.close();
        }
        System.out.println(result);
    }
}
