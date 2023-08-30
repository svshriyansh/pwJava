/*Write a program to find the largest element of a given 2D array of integers. */
package Assignments;

import java.util.*;

public class matrix4 {
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
        int largest = mat[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coll; j++) {
                if (mat[i][j] > largest) {
                    largest = mat[i][j];
                }
            }
        }
        System.out.println("Largest number in an array is : " + largest);

        sc.close();
    }
}
