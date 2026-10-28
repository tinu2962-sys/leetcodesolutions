import java.util.*;

class Solution {
    private List<List<String>> result = new ArrayList<>();
    private Set<Integer> cols = new HashSet<>();
    private Set<Integer> diagonals = new HashSet<>();
    private Set<Integer> antiDiagonals = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        backtrack(0, n, board);
        return result;
    }

    private void backtrack(int row, int n, char[][] board) {
        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            int currDiag = row - col;
            int currAntiDiag = row + col;

            if (cols.contains(col) || diagonals.contains(currDiag) || antiDiagonals.contains(currAntiDiag)) {
                continue;
            }

            board[row][col] = 'Q';
            cols.add(col);
            diagonals.add(currDiag);
            antiDiagonals.add(currAntiDiag);

            backtrack(row + 1, n, board);

            board[row][col] = '.';
            cols.remove(col);
            diagonals.remove(currDiag);
            antiDiagonals.remove(currAntiDiag);
        }
    }

    private List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            path.add(new String(board[i]));
        }
        return path;
    }
}
