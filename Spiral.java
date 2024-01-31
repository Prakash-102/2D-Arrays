
//Creation of 2D Arrays ?:- 
import java.util.*;

public class Spiral {
    public static void printSpiral(int matrix[][]) {
        int starRow = 0;
        int starCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (starRow <= endRow && starCol <= endCol) {
            // top
            for (int j = starCol; j <= endCol; j++) {
                System.out.print(matrix[starRow][j] + " ");
            }
            // right
            for (int i = starRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol - 1; j >= starCol; j--) {
                if (starRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= starRow + 1; i--) {
                if (starCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][starCol] + " ");
            }

            starCol++;
            starRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printSpiral(matrix);
    }
}
/*
 * Output:-
 * 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */
