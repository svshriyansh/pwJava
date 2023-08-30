//SC = O(1)
//TC = O(n)
package DSA.twoDimensional;

import java.util.*;

public class LinearSearch {
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

        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Targeted element is found at index : " + idx);
        }

        sc.close();

    }

}
