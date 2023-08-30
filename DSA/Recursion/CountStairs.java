package DSA.Recursion;

import java.util.Scanner;

public class CountStairs {
    public static int findStair(int n) {
        // int result = 0;
        if (n <= 1) {
            return n;
        } else {
            return findStair(n - 1) + (n - 2);
        }
        // result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stair number :");
        int stair = sc.nextInt();
        // function Calling
        int steps = findStair(stair + 1);
        System.out.println("The number of ways are :");
        System.out.println(steps);
        sc.close();
    }

}
