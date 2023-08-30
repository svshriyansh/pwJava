// Q5: Write a function which accepts a 2D array of integers and its size as arguments and
// displays the elements of middle row and the elements of middle column. Printing can
// be done in any order.
package Assignments;

import java.util.*;

public class matrix5 {
    public static ArrayList<Integer> matrixMiddle(int[][] mat, int size) {
        ArrayList<Integer> elements = new ArrayList<Integer>();
        int middle = size / 2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == middle || j == middle) {
                    elements.add(mat[i][j]);
                }
            }
        }
        return elements;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of collumn");
        int coll = sc.nextInt();
        int[][] mat = new int[row][coll];
        System.out.println("Enter the number");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coll; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> elements = matrixMiddle(mat, coll);
        System.out.println(elements);
        sc.close();
    }
}
