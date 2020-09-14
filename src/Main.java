/*
    This is a simple implementation of Conway's Game of Life. Every subsequent trial is separated by "~~~~~~~~"
    Rules: Any live cell with two or three live neighbours survives.
    Any dead cell with three live neighbours becomes a live cell.
    All other live cells die in the next generation. Similarly, all other dead cells stay dead.
*/

import java.util.Arrays;

public class Main {

    static int NUM_ROWS = 10, NUM_COLUMNS = 10, NUM_TRIALS = 15;
    static char ALIVE_CHAR = '+', DEAD_CHAR = ' ';

    public static void main(String[] args) {
        int[][] matrix = initMatrix(NUM_ROWS, NUM_COLUMNS);
        printMatrix(matrix, NUM_ROWS, NUM_COLUMNS);
        for (int i = 0; i < NUM_TRIALS; i++) {
            System.out.println("\n~~~~~~~~~~~~~~~\n");
            matrix = updateMatrix(matrix);
            printMatrix(matrix, NUM_ROWS, NUM_COLUMNS);
        }
    }

    private static int[][] initMatrix(int r, int c) {
        int[][] matrix = new int[r][c];
        for (int[] row : matrix) Arrays.fill(row, 0);
        matrix[5][5] = 1;
        matrix[4][6] = 1;
        matrix[4][5] = 1;
        matrix[5][4] = 1;
        matrix[6][5] = 1;
        return matrix;
    }

    private static int[][] updateMatrix(int[][] matrix) {
        int[][] future = new int[NUM_ROWS][NUM_COLUMNS];
        for (int[] row : future) Arrays.fill(row, 0);
        for (int s = 1; s < NUM_ROWS - 1; s++) {
            for (int t = 1; t < NUM_COLUMNS - 1; t++) {
                int aliveNeighbours = getAliveNeighbours(matrix, s, t);
                if (matrix[s][t] == 1 && (aliveNeighbours == 2 || aliveNeighbours == 3)) future[s][t] = 1;
                else if (matrix[s][t] == 0 && aliveNeighbours == 3) future[s][t] = 1;
                else future[s][t] = matrix[s][t];
            }
        }
        return future;
    }

    private static int getAliveNeighbours(int[][] matrix, int s, int t) {
        int aliveNeighbours = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                aliveNeighbours += matrix[s + i][t + j];
            }
        }
        aliveNeighbours -= matrix[s][t];
        return aliveNeighbours;
    }

    private static void printMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) System.out.print(ALIVE_CHAR);
                else System.out.print(DEAD_CHAR);
            }
            System.out.println();
        }
    }
}
