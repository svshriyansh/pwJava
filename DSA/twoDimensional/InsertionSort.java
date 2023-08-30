package DSA.twoDimensional;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 50, 12, 2, 13, 9 };
        insertionSort(arr);
        System.out.println("The sorted array using insertion sort is : ");
        System.out.println(Arrays.toString(arr));
    }
}
