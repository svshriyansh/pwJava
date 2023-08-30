package DSA.oneD;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of number:");
        int size = sc.nextInt();
        System.out.println("Enter the number to check is palindrome or not");
        int[] value = new int[size];
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            value[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (value[i] != value[size - i - 1]) {
                System.out.println("Number is not palindrome");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Number is palindrome");
        }
        sc.close();

    }
}
