package DSA.Recursion;

import java.util.Scanner;

public class nQueen {
    public static void solve(boolean[][] board, boolean[] cols, boolean[] ndig, boolean[] rdig, int row, String ans) {
        if (row == board.length) {
            System.out.println(ans + ".");
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (cols[col] == false && ndig[row + col] == false && rdig[row - col + (board[0].length - 1)] == false) {

                board[row][col] = true;
                cols[col] = true;
                ndig[row + col] = true;
                rdig[row - col + (board[0].length - 1)] = true;
                solve(board, cols, ndig, rdig, row + 1, ans + row + "-" + col + ", ");
                board[row][col] = false;
                cols[col] = false;
                ndig[row + col] = false;
                rdig[row - col + (board[0].length - 1)] = false;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of board");
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        boolean[] cols = new boolean[n];
        boolean[] ndig = new boolean[2 * n - 1];
        boolean[] rdig = new boolean[2 * n - 1];
        solve(board, cols, ndig, rdig, 0, "");
        sc.close();
    }

}
