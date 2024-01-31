package Recursion;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArrayExample {

    public static List<List<String>> runArraysListsExample() {
        List<List<String>> result = new ArrayList<>();
        // Filling result with 5 lists of type String
        for (int i = 0; i < 5; i++) {
            List<String> innerList = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                innerList.add("String_" + i + "_" + j);
            }
            result.add(innerList);
        }

        return result;

    }

    public static void displayArrayList(List<List<String>> list) {

        list = runArraysListsExample();

        // Displaying the content of the result
        for (List<String> result : list) {
            System.out.println(result);
        }
    }

    public static void initiateBoard(int n) {

        // Example size of the board
        char[][] board = new char[n][n];

        // Initialize the board with dots
        for (int i = 0; i < n; i++) {
            // initialize the rows with i
            for (int j = 0; j < n; j++) {
                // initiialize the columns with j
                board[i][j] = '.';
            }
        }

        // Displaying the board of dots
        System.out.println("Board of Dots:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<List<String>> result = runArraysListsExample();
        initiateBoard(3);
        displayArrayList(result);
    }
}
/*
 * A two-dimensional array is commonly used to represent a grid-like structure,
 * such as a chessboard. Each element in the array corresponds to a cell in the
 * grid. In the context of a chessboard, each cell represents a square on the
 * board.
 * The outer loop (for (int i = 0; i < 5; i++)) runs 5 times. This loop is
 * responsible for creating each row of the board.
 * The inner loop (for (int j = 0; j < 5; j++)) also runs 5 times for each
 * iteration of the outer loop. This loop is responsible for filling each row
 * with elements.
 * So, the length of the board is determined by the number of iterations of the
 * outer loop, which is 5 in this case. Therefore, the board has 5 rows and each
 * row has 5 elements, resulting in a 5x5 board.
 * 
 * Here's how a two-dimensional array can establish a chessboard:
 * 
 * Initializing the Array: You create a two-dimensional array with dimensions
 * representing the rows and columns of the chessboard. For example, a standard
 * chessboard is 8x8, so you'd create an array like char[][] board = new
 * char[8][8];.
 * 
 * Populating the Array: Each element in the array represents a cell on the
 * chessboard. You can initialize the array with certain characters or values to
 * represent the initial state of the chessboard. In the case of representing an
 * empty chessboard, you can initialize all elements with a dot '.', which
 * signifies an empty cell.
 * 
 * Accessing Cells: You can access individual cells on the chessboard by
 * specifying their row and column indices. For example, board[0][0] would
 * represent the top-left corner of the chessboard, and board[7][7] would
 * represent the bottom-right corner.
 * 
 * Manipulating the Board: As the state of the chessboard changes (pieces being
 * moved, captured, etc.), you can update the values in the array accordingly.
 * For example, if a pawn is moved from position (1, 2) to position (3, 2), you
 * would update board[1][2] to '.' (empty) and board[3][2] to 'P' (pawn).
 * 
 * By using a two-dimensional array in this way, you can easily represent and
 * manipulate the state of a chessboard in a programmatic manner.
 * 
 */