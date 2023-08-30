package DSA.twoDimensional;

import java.util.*;

public class PreSumBrut {

    public static int findSumMatrix(int[][] mat, int r1, int r2, int c1, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
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

        System.out.println("Enter the stating row no.");
        int r1 = sc.nextInt();
        System.out.println("Enter the stating collumn no.");
        int c1 = sc.nextInt();
        System.out.println("Enter the ending row no.");
        int r2 = sc.nextInt();
        System.out.println("Enter the ending collumn no.");
        int c2 = sc.nextInt();

        int sum = findSumMatrix(mat, r1, r2, c1, c2);
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
