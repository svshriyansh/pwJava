package DSA.Recursion;

public class sudoko {
    public static boolean solve(char[][] board, int i, int j) {
        int ni = 0;
        int nj = 0;
        if (i == board.length) {
            return true;
        }
        if (board[0].length - 1 == j) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }
        if (board[i][j] != '.') {
            return solve(board, ni, nj);
        } else {
            // po = pre occupied
            for (char po = '1'; po <= '9'; po++) {
                if (isValid(board, i, j, po)) {
                    board[i][j] = po;
                    if (solve(board, ni, nj)) {
                        return true;
                    }
                }
                board[i][j] = '.';
            }
        }
        return false;
    }

    public static boolean isValid(char[][] board, int i, int j, char val) {
        // check column
        for (int curi = 0; curi < 9; curi++) {
            if (board[i][curi] == val) {
                return false;
            }
        }
        // check row
        for (int curi = 0; curi < 9; curi++) {
            if (board[curi][j] == val) {
                return false;
            }
        }
        // check mimi matrix
        int indii = i / 3 * 3;
        int indij = j / 3 * 3;
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                if (board[m + indii][n + indij] == val) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        if (solve(board, 0, 0)) {

            for (int m = 0; m < 9; m++) {
                for (int n = 0; n < 9; n++) {
                    System.out.print(board[m][n] + " ");
                }
                System.out.println();
            }
        }

    }

}
