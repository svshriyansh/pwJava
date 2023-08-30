package DSA.Recursion;

import java.util.*;

public class ratMaze {
    public static void solve(int i, int j, int[][] arr, ArrayList<String> ans, int[][] vis, int[] di, int[] dj, int n,
            String moves) {
        // base condition

        if ((i == n - 1) && (j == n - 1)) {
            ans.add(moves);
            return;
        }

        // recursive code
        char[] dir = { 'D', 'L', 'R', 'U' };
        for (int ind = 0; ind < 4; ind++) {
            int nexti = i + di[ind];
            int nextj = j + dj[ind];
            if (nexti >= 0 && nexti < n && nextj >= 0 && nextj < n && vis[nexti][nextj] == 0
                    && arr[nexti][nextj] == 1) {
                vis[i][j] = 1;
                solve(nexti, nextj, arr, ans, vis, di, dj, n, moves + dir[ind]);
                vis[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] arr = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        int[][] vis = new int[n][n];// visited matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vis[i][j] = 0;
            }
        }
        int[] di = { 1, 0, 0, -1 };
        int[] dj = { 0, -1, 1, 0 };

        ArrayList<String> ans = new ArrayList<String>();
        if (arr[0][0] == 1) {
            solve(0, 0, arr, ans, vis, di, dj, n, "");
        }
        if (ans.size() > 0) {
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");

            }
        } else {
            System.out.println("-1");
        }
    }
}
