//bruteForce
package DSA.Recursion;

import java.util.Scanner;

public class PowOfN {
    public static int powOfN(int a, int b) {
        int result = 0;
        if (b == 1) {
            return a;
        } else {
            result = a * powOfN(a, b - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value");
        int a = sc.nextInt();
        System.out.println("Enter the power for the base value");
        int b = sc.nextInt();
        int result = powOfN(a, b);
        System.out.println("The ans is : " + result);
        sc.close();
    }
}
