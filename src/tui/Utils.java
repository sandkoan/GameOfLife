package tui;

import java.util.Scanner;

import static tui.ColoredPrinting.*;
import static tui.Game.updateMatrix;
import static tui.Guns.*;

public class Utils {

    // Defaults
    static int NUM_ROWS = 5, NUM_COLUMNS = 5, NUM_TRIALS = 5;
    static String DIVIDING_STRING = "~", GUN_TYPE = "random";

    static void setOpts() {
        Scanner sc = new Scanner(System.in);
        String[] arguments = sc.nextLine().toUpperCase().split(", ");
        for (String pair : arguments) {
            String[] splitPair = pair.split(": ");
            String name = splitPair[0], value = splitPair[1];
//            System.out.println(name + " --> " + value);
            switch(name) {
                case "GUN":
                    GUN_TYPE = value.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    break;
                case "ALIVECHAR":
                    ALIVE_CHAR = value.charAt(0);
                    break;
                case "DEADCHAR":
                    DEAD_CHAR = value.charAt(0);
                    break;
                case "DIVIDINGSTRING":
                    DIVIDING_STRING = value;
                    break;
                default:
                    NUM_TRIALS = Integer.parseInt(value);
            }
        }
        sc.close();
    }

    static int[][] setMatrix() {
        int[][] matrix;
        switch(GUN_TYPE) {
            case "blinker":
                matrix = initBlinkerMatrix(NUM_ROWS, NUM_COLUMNS);
                break;
            case "beacon":
                matrix = initBeaconMatrix(NUM_ROWS, NUM_COLUMNS);
                break;
            case "glider":
                matrix = initGliderMatrix(NUM_ROWS, NUM_COLUMNS);
                break;
            case "combination":
                matrix = initCombinationMatrix(NUM_ROWS, NUM_COLUMNS);
                break;
            case "gosperglider":
                matrix = initGosperGliderMatrix(NUM_ROWS, NUM_COLUMNS);
                break;
            default:
                matrix = initRandomMatrix(NUM_ROWS, NUM_COLUMNS);
        }
        return matrix;
    }

    static void gameLoop() {
        printOpts();
        setOpts();
        int[][] matrix = setMatrix();
        printMatrix(matrix, NUM_ROWS, NUM_COLUMNS);
        for (int i = 0; i < NUM_TRIALS; i++) {
            System.out.println(ANSI_PURPLE + DIVIDING_STRING.repeat(NUM_COLUMNS / DIVIDING_STRING.length()) + ANSI_RESET);
            matrix = updateMatrix(matrix);
            printMatrix(matrix, NUM_ROWS, NUM_COLUMNS);
        }
    }
}
