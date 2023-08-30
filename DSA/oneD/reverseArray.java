package DSA.oneD;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of number:");
        int size = sc.nextInt();
        System.out.println("Enter the number to be reversed");
        int[] value = new int[size];

        for (int i = 0; i < size; i++) {
            value[i] = sc.nextInt();
        }
        int i = 0;
        while (i < size / 2) {
            int temp = value[i];
            value[i] = value[size - i - 1];
            value[size - i - 1] = temp;
            i++;
        }
        System.out.println("Reversed array is : ");
        for (int data : value) {
            System.out.print(data + " ");
        }
        sc.close();
    }
}
