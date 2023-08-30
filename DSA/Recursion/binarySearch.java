package DSA.Recursion;

import java.util.*;

public class binarySearch {
    public static int searching(int[] arr, int low, int high, int target) {
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                // left side
                return searching(arr, low, mid - 1, target);
            } else {
                // right side
                return searching(arr, mid + 1, high, target);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 5, 6, 7, 10, 11 };
        System.out.println("Enter the targeted value");
        int val = sc.nextInt();
        int result = searching(arr, 0, arr.length - 1, val);
        if (result == -1) {
            System.out.println("Element " + val + " is not found ");
        } else {
            System.out.println("Element " + val + " is found at index " + result);
        }
        sc.close();
    }
}
