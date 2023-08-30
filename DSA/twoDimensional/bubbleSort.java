package DSA.twoDimensional;

import java.util.*;

public class bubbleSort {
    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swaped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 20, 50, 10, 12, 45, 67, 90 };
        BubbleSort(arr);
        System.out.println("Sorted array is : \n" + Arrays.toString(arr));

    }
}
