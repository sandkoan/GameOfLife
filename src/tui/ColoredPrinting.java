package tui;

public class ColoredPrinting {

    // Colored Printing Foreground
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_BLACK = "\u001B[30m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_BLUE = "\u001B[34m";
    static final String ANSI_PURPLE = "\u001B[35m";
    static final String ANSI_CYAN = "\u001B[36m";
    static final String ANSI_WHITE = "\u001B[37m";

    // Colored Printing Background
    static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    static char ALIVE_CHAR = '\u2596', DEAD_CHAR = ' ';
    static String ALIVE_COLOR = ANSI_CYAN, DEAD_COLOR = ANSI_BLACK;

    static void printMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) System.out.print(ALIVE_COLOR + ALIVE_CHAR + ANSI_RESET);
                else System.out.print(DEAD_COLOR + DEAD_CHAR + ANSI_RESET);
            }
            System.out.println();
        }
    }

    static void printOpts() {
        System.out.println(
                ANSI_RED + "Options:\n" + ANSI_RESET +
                        ANSI_BLUE + "gun (default=random, blinker, beacon, glider, combination, gosperGlider), " +
                        "number of trials (default=10),\n" +
                        "aliveChar (default=\u2596),\n" +
                        "deadChar (default= [space]),\n" +
                        "dividingChar (default=~)\n" + ANSI_RESET +
//                "aliveColor (default=cyan, green, red, yellow, blue, purple, black, white),\n" +
//                "deadColor (default=black, cyan, green, red, yellow, blue, purple, white )\n\n" +
                        ANSI_PURPLE + "Each name-value pair should be comma-separated.\n" +
                        "Each name and value should be separated from each other by a : and space.\n" + ANSI_RESET +
                        ANSI_GREEN + "Example:\n" + ANSI_RESET +
                        ANSI_YELLOW + "gun: glider, " +
                        "trials: 30, " +
                        "aliveChar: *, " +
                        "deadChar:  , " +
//                        "aliveColor cyan, " +
//                        "deadColor green, " +
                        "dividingString: ~" + ANSI_RESET
        );
    }
}
