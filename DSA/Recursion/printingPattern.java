package DSA.Recursion;

import java.util.*;

public class printingPattern {

    public static void printing(int[] arr, int index, ArrayList<Integer> tempArr) {
        // base case
        if (index == arr.length) {
            if (tempArr.size() > 0) {
                System.out.println(tempArr);
            }
            return;
        }
        // recursive call
        printing(arr, index + 1, tempArr);
        tempArr.add(arr[index]);

        printing(arr, index + 1, tempArr);
        tempArr.remove(tempArr.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println("For the arrays " + Arrays.toString(arr));
        printing(arr, 0, new ArrayList<>());
    }
}
