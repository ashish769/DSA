package Backtracking;

public class Nqueen {

    // Print the board with row-column labels and line separation
    public void printBoard(int[][] board, int n) {
        System.out.println("Solution:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q" + " ");
                } else {
                    System.out.print("." + " ");
                }
            }
            System.out.println();
        }
    }

    // Check if placing a queen at board[row][col] is safe
    public boolean isSafe(int[][] board, int row, int col, int n) {
        // Check the column for another queen
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check the upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check the upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true; // Safe placement
    }

    // Solve the N-Queens problem using backtracking
    public boolean solveNQueens(int[][] board, int row, int n) {
        if (row == n) { // Base case: All queens placed successfully
            return true;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1; // Place the queen
                if (solveNQueens(board, row + 1, n)) { // Recur for the next row
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }

        return false; // No valid placement found for this row
    }

    public static void main(String[] args) {
        int n = 6; // Size of the chessboard
        int[][] board = new int[n][n]; // Initialize the board

        Nqueen solver = new Nqueen(); // Create an instance of the class
        if (solver.solveNQueens(board, 0, n)) {
            solver.printBoard(board, n); // Print the solution
        } else {
            System.out.println("No solution exists");
        }
    }
}
