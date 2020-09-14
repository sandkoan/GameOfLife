package tui;

import java.util.Arrays;

import static tui.Utils.NUM_COLUMNS;
import static tui.Utils.NUM_ROWS;

public class Game {

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

    static int[][] updateMatrix(int[][] matrix) {
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
}
