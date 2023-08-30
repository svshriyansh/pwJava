package Assignments;

import java.util.*;

public class matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of collumn");
        int coll = sc.nextInt();
        int[][] mat = new int[row][coll];
        System.out.println("Enter the number");
        int positive = 0, negative = 0, odd = 0, even = 0, zeros = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coll; j++) {
                mat[i][j] = sc.nextInt();

                if (mat[i][j] == 0) {
                    zeros += 1;
                }
                if (mat[i][j] > 0) {
                    positive += 1;
                }
                if (mat[i][j] < 0) {
                    negative += 1;
                }
                if (mat[i][j] % 2 == 0) {
                    even += 1;
                }
                if (mat[i][j] % 2 != 0) {
                    odd += 1;
                    // System.out.println(mat[i][j]);
                }
            }
        }

        System.out.println("number of positive numbers = " + positive +
                "\nnumber of negative numbers = " + negative +
                "\nnumber of odd numbers = " + odd +
                "\nnumber of even numbers = " + even +
                "\nnumber of 0 = " + zeros);

        sc.close();
    }
}
