//fibonacci
//TC = O(2^n) exponential
//SC = O(n)
package DSA.Recursion;

import java.util.Scanner;

public class fib {
    public static int fibonacci(int n) {
        int result = 0;
        if (n <= 1) {
            return n;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in fibbonaci series");
        int n = sc.nextInt();
        int val = fibonacci(n);
        System.out.println("Fibbonacci series number is : " + val);
        sc.close();
    }
}
