//TC = O(n) we get it by solving recurrance relation
//SC = O(n) using stack
package DSA.Recursion;

import java.util.Scanner;

public class factorial {
    public static int Factorial(int n) {

        if (n == 1 || n == 0) {
            return 1;
        } else {
            int result = n * Factorial(n - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int val = Factorial(n);
        System.out.println(val);
        sc.close();
    }
}
