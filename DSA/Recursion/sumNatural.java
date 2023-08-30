package DSA.Recursion;

import java.util.*;

public class sumNatural {
    public static int sumNum(int n) {
        if (n == 0) {
            return n;
        }
        int rem = n % 10;
        int q = n / 10;
        int sum = rem + sumNum(q);
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int value = sumNum(n);
        System.out.println(value);
        sc.close();
    }
}
