//Rcurance relation 2T(n/2) +n
//Time Complexity n(logn)
//Spacee Complexity O(n)
//OutPlace sorting  algorithm needs extra space to put the elements in as it's sorting them
//Stable sorting  which means that the same element in an array maintain their original positions
package DSA.DivideAndConqure;

public class mergeSort {
    public static void merge(int[] arr, int mid, int l, int r) {
        int i, j, k;
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lsubArray = new int[n1];
        int[] rsubArray = new int[n2];

        // copy the data into left and right ssubaray
        for (i = 0; i < n1; i++) {
            lsubArray[i] = arr[l + i];
        }

        for (j = 0; j < n2; j++) {
            rsubArray[j] = arr[mid + 1 + j];
        }

        // comparision between left and right subarray
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (lsubArray[i] <= rsubArray[j]) {
                arr[k] = lsubArray[i];
                i += 1;

            } else {
                arr[k] = rsubArray[j];
                j += 1;

            }
            k += 1;
        }
        while (i < n1) {
            arr[k] = lsubArray[i];
            i += 1;
            k += 1;
        }

        while (j < n2) {
            arr[k] = rsubArray[j];
            j += 1;
            k += 1;
        }

    }

    public static void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    public static void MergeSort(int[] arr, int n, int low, int high) {
        if (arr.length <= 1) {
            return;
        }
        if (low < high) {
            // divide the array in two halfs
            int mid = low + (high - low) / 2;
            MergeSort(arr, n, low, mid);
            MergeSort(arr, n, mid + 1, high);
            merge(arr, mid, low, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 50, 99, 30, 90 };
        int n = arr.length;
        System.out.println("Array before sorting");
        printArray(arr);
        MergeSort(arr, n, 0, n - 1);
        System.out.println("\nArray after sorting");
        printArray(arr);

    }

}
