package DSA.oneD;

import java.util.*;

public class missingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the numbers");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int tsum = 0;
        for (int i : arr) {
            tsum += i;
        }

        int sum = ((size + 1) * (size + 2)) / 2;
        int missingEle = sum - tsum;
        System.out.println("Missing element in array is :- " + missingEle);
        sc.close();

    }
}
