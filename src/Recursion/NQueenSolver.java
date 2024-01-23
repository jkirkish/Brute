package Recursion;

import java.util.ArrayList;

public class NQueenSolver {

    static ArrayList<ArrayList<String>> find_all_arrangements(Integer n) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        initializeBoard(board);

        solveNQueens(board, 0, result);

        return result;
    }

    static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void solveNQueens(char[][] board, int row, ArrayList<ArrayList<String>> result) {
        if (row == board.length) {
            // Found a valid arrangement, add it to the result
            result.add(createBoardSnapshot(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                // Place queen and recurse
                board[row][col] = 'q';
                solveNQueens(board, row + 1, result);
                // Backtrack
                board[row][col] = '-';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'q') {
                return false;
            }
        }

        // Check if there is a queen in the upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'q') {
                return false;
            }
        }

        // Check if there is a queen in the upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'q') {
                return false;
            }
        }

        return true;
    }

    static ArrayList<String> createBoardSnapshot(char[][] board) {
        ArrayList<String> snapshot = new ArrayList<>();
        for (char[] row : board) {
            snapshot.add(new String(row));
        }
        return snapshot;
    }

    public static void main(String[] args) {
        // Example usage
        Integer n = 4;
        ArrayList<ArrayList<String>> result = find_all_arrangements(n);
        System.out.println(result);
    }
}
