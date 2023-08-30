//First occurance of duplicate element
package DSA.twoDimensional;

import java.util.*;

public class LowerBound {

    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
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

        int value = lowerBound(arr, x);
        if (value == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Targeted element is found at index : " + value);
        }

        sc.close();
    }
}
