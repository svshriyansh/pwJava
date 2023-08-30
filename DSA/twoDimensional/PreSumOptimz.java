package DSA.twoDimensional;

import java.util.*;

public class PreSumOptimz {
    public static void findPreSum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        // collumn wise
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                mat[i][j] += mat[i][j - 1];// element + piche vale[j-1] element ka sum
            }
        }

        // row wise
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                mat[i][j] += mat[i - 1][j];
            }
        }

    }

    public static int sumRegion(int[][] mat, int r1, int r2, int c1, int c2) {
        int sum = 0;
        int left = 0;
        int up = 0;
        int result = 0;
        int repeatedRegion = 0;
        left = mat[r2][c1 - 1];
        up = mat[r1 - 1][c2];
        repeatedRegion = mat[r1 - 1][c1 - 1];
        sum = mat[r2][c2];
        result = sum - up - left + repeatedRegion;
        return result;

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

        // int sum = findSumMatrix(mat, r1, r2, c1, c2);
        findPreSum(mat);
        int sum = sumRegion(mat, r1, r2, c1, c2);
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
