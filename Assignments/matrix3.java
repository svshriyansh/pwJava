/*Q3: Write a program to print the elements of both the diagonals in a user inputted square matrix in any order */
package Assignments;

import java.util.*;

public class matrix3 {
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
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < coll; j++) {
        // if ((i == j) || (i + j == (row - 1))) {
        // System.out.print(mat[i][j] + " ");
        // }
        // }
        // }

        for (int i = 0; i < row; i++) {
            System.out.print(mat[i][i] + " ");
            if (i != row - i - 1) {
                System.out.print(mat[i][row - i - 1] + " ");
            }
        }
        sc.close();
    }

}
