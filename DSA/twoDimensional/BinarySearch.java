// TC = O(log n base 2)
// SC = O(1)
package DSA.twoDimensional;

import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targeted element ");
        int x = sc.nextInt();

        int value = binarySearch(arr, x);
        if (value == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Targeted element is found at index : " + value);
        }

        sc.close();
    }
}
