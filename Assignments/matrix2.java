/*Q2: Write a program to print the elements above the secondary diagonal in a user inputted
square matrix.
 */
package Assignments;

import java.util.*;

public class matrix2 {
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

        System.out.print("Elements above second diagonals are\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coll; j++) {
                if (i + j < coll - 1) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        sc.close();
    }
}
