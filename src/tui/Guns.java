package tui;

import java.util.Arrays;

public class Guns {
    private static void fillZeros(int[][] matrix) {
        for (int[] row : matrix)
            Arrays.fill(row, 0);
    }

    static int[][] initRandomMatrix(int r, int c) {
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = Math.random() > 0.65 ? 1 : 0;
            }
        }
        return matrix;
    }

    static int[][] initBlinkerMatrix(int r, int c) {
        // Blinker: (game-start '((0 1) (1 1) (2 1)) 3 10)
        int[][] matrix = new int[r][c];
        fillZeros(matrix);
        matrix[0][1] = matrix[1][1] = matrix[2][1] = 1;
        return matrix;
    }

    static int[][] initBeaconMatrix(int r, int c) {
        // Beacon: (game-start '((1 1) (2 1) (1 2) (4 3) (3 4) (4 4)) 6 10)
        int[][] matrix = new int[r][c];
        fillZeros(matrix);
        matrix[1][1] = matrix[1][2] = matrix[2][1] = matrix[3][4] = matrix[4][3] = matrix[4][4] = 1;
        return matrix;
    }

    static int[][] initGliderMatrix(int r, int c) {
        // Glider: (game-start '((1 0) (2 1) (0 2) (1 2) (2 2)) 20 50)
        int[][] matrix = new int[r][c];
        fillZeros(matrix);
        matrix[1][0] = matrix[2][1] = matrix[0][2] = matrix[1][2] = matrix[2][2] = 1;
        return matrix;
    }

    static int[][] initCombinationMatrix(int r, int c) {
        // Combination: (game-start '((0 12) (1 12) (2 12) (1 6) (2 7) (0 8) (1 8) (2 8)) 20 100)
        int[][] matrix = new int[r][c];
        fillZeros(matrix);
        matrix[0][12] = matrix[1][12] = matrix[2][12] = matrix[1][6] = matrix[2][7] = matrix[0][8] = matrix[1][8] = matrix[2][8] = 1;
//        matrix[12][0] = matrix[12][1] = matrix[12][2] = matrix[6][1] = matrix[7][2] = matrix[8][0] = matrix[8][1] = matrix[8][2] = 1;
        return matrix;
    }

    static int[][] initGosperGliderMatrix(int r, int c) {
// Gosper Glider Gun: (game-start '((5 1) (5 2) (6 1) (6 2) (5 11) (6 11) (7 11) (4 12) (3 13) (3 14) (8 12) (9 13) (9 14) (6 15) (4 16) (5 17) (6 17) (7 17)
// (6 18) (8 16) (3 21) (4 21) (5 21) (3 22) (4 22) (5 22) (2 23) (6 23) (1 25) (2 25) (6 25) (7 25) (3 35) (4 35) (3 36) (4 36)) 40 50)
        int[][] matrix = new int[r][c];
        fillZeros(matrix);
//        matrix[1][5] = matrix[2][5] = matrix[1][6] = matrix[2][6] = matrix[11][5] = matrix[11][6] = matrix[11][7] = matrix[12][4] = matrix[13][3] = matrix[14][3] = matrix[12][8] = matrix[13][9] = matrix[14][9] = matrix[15][6] = matrix[16][4] = matrix[17][5] = matrix[17][6] = matrix[17][7] = matrix[18][6] = matrix[16][8] = matrix[21][3] = matrix[21][4] = matrix[21][5] = matrix[22][3] = matrix[22][4] = matrix[22][5] = matrix[23][2] = matrix[23][6] = matrix[25][1] = matrix[25][2] = matrix[25][6] = matrix[25][7] = matrix[35][3] = matrix[35][4] = matrix[36][3] = matrix[36][4] = 1;
        matrix[5][1] = matrix[5][2] = matrix[6][1] = matrix[6][2] = matrix[5][11] =
                matrix[6][11] = matrix[7][11] = matrix[4][12] = matrix[3][13] = matrix[3][14] =
                        matrix[8][12] = matrix[9][13] = matrix[9][14] = matrix[6][15] = matrix[4][16] =
                                matrix[5][17] = matrix[6][17] = matrix[7][17] = matrix[6][18] = matrix[8][16] =
                                        matrix[3][21] = matrix[4][21] = matrix[5][21] = matrix[3][22] = matrix[4][22] =
                                                matrix[5][22] = matrix[2][23] = matrix[6][23] = matrix[1][25] = matrix[2][25] =
                                                        matrix[6][25] = matrix[7][25] = matrix[3][35] = matrix[4][35] = matrix[3][36] = matrix[4][36] = 1;
        return matrix;
    }

    static int[][] initBlinkerMatrix() {
        // Blinker: (game-start '((0 1) (1 1) (2 1)) 3 10)
        int[][] matrix = new int[3][3];
        fillZeros(matrix);
        matrix[0][1] = matrix[1][1] = matrix[2][1] = 1;
        return matrix;
    }

    static int[][] initBeaconMatrix() {
        // Beacon: (game-start '((1 1) (2 1) (1 2) (4 3) (3 4) (4 4)) 6 10)
        int[][] matrix = new int[6][6];
        fillZeros(matrix);
        matrix[1][1] = matrix[1][2] = matrix[2][1] = matrix[3][4] = matrix[4][3] = matrix[4][4] = 1;
        return matrix;
    }

    static int[][] initGliderMatrix() {
        // Glider: (game-start '((1 0) (2 1) (0 2) (1 2) (2 2)) 20 50)
        int[][] matrix = new int[20][20];
        fillZeros(matrix);
        matrix[1][0] = matrix[2][1] = matrix[0][2] = matrix[1][2] = matrix[2][2] = 1;
        return matrix;
    }

    static int[][] initCombinationMatrix() {
        // Combination: (game-start '((0 12) (1 12) (2 12) (1 6) (2 7) (0 8) (1 8) (2 8)) 20 100)
        int[][] matrix = new int[20][20];
        fillZeros(matrix);
        matrix[0][12] = matrix[1][12] = matrix[2][12] = matrix[1][6] = matrix[2][7] = matrix[0][8] = matrix[1][8] = matrix[2][8] = 1;
//        matrix[12][0] = matrix[12][1] = matrix[12][2] = matrix[6][1] = matrix[7][2] = matrix[8][0] = matrix[8][1] = matrix[8][2] = 1;
        return matrix;
    }

    static int[][] initGosperGliderMatrix() {
// Gosper Glider Gun: (game-start '((5 1) (5 2) (6 1) (6 2) (5 11) (6 11) (7 11) (4 12) (3 13) (3 14) (8 12) (9 13) (9 14) (6 15) (4 16) (5 17) (6 17) (7 17)
// (6 18) (8 16) (3 21) (4 21) (5 21) (3 22) (4 22) (5 22) (2 23) (6 23) (1 25) (2 25) (6 25) (7 25) (3 35) (4 35) (3 36) (4 36)) 40 50)
        int[][] matrix = new int[40][40];
        fillZeros(matrix);
//        matrix[1][5] = matrix[2][5] = matrix[1][6] = matrix[2][6] = matrix[11][5] = matrix[11][6] = matrix[11][7] = matrix[12][4] = matrix[13][3] = matrix[14][3] = matrix[12][8] = matrix[13][9] = matrix[14][9] = matrix[15][6] = matrix[16][4] = matrix[17][5] = matrix[17][6] = matrix[17][7] = matrix[18][6] = matrix[16][8] = matrix[21][3] = matrix[21][4] = matrix[21][5] = matrix[22][3] = matrix[22][4] = matrix[22][5] = matrix[23][2] = matrix[23][6] = matrix[25][1] = matrix[25][2] = matrix[25][6] = matrix[25][7] = matrix[35][3] = matrix[35][4] = matrix[36][3] = matrix[36][4] = 1;
        matrix[5][1] = matrix[5][2] = matrix[6][1] = matrix[6][2] = matrix[5][11] =
                matrix[6][11] = matrix[7][11] = matrix[4][12] = matrix[3][13] = matrix[3][14] =
                        matrix[8][12] = matrix[9][13] = matrix[9][14] = matrix[6][15] = matrix[4][16] =
                                matrix[5][17] = matrix[6][17] = matrix[7][17] = matrix[6][18] = matrix[8][16] =
                                        matrix[3][21] = matrix[4][21] = matrix[5][21] = matrix[3][22] = matrix[4][22] =
                                                matrix[5][22] = matrix[2][23] = matrix[6][23] = matrix[1][25] = matrix[2][25] =
                                                        matrix[6][25] = matrix[7][25] = matrix[3][35] = matrix[4][35] = matrix[3][36] = matrix[4][36] = 1;
        return matrix;
    }
}
