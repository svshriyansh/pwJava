package Revision;

import java.util.ArrayList;

public class ratMaze {
    public static void findPath(int[][] arr, ArrayList<String> ans, int row, int col, boolean[][] visited, String s,
            int size) {
        if (row == size - 1 && col == size - 1 && arr[row][col] == 1) {
            ans.add(s);
            return;
        }
        if (row >= 0 && row < size && col >= 0 && col < size) {
            if (visited[row][col] == true || arr[row][col] == 0) {
                return;
            }

            visited[row][col] = true;
            findPath(arr, ans, row + 1, col, visited, s + "D", size);
            findPath(arr, ans, row, col - 1, visited, s + "L", size);
            findPath(arr, ans, row, col + 1, visited, s + "R", size);
            findPath(arr, ans, row - 1, col, visited, s + "U", size);
            visited[row][col] = false;
        }

    }

    public static void main(String[] args) {
        int size = 4;
        ArrayList<String> ans = new ArrayList<>();
        int[][] arr = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        boolean[][] visited = new boolean[4][4];
        System.out.println(visited[0][0]);
        findPath(arr, ans, 0, 0, visited, "", size);
        System.out.println(ans);
    }
}
