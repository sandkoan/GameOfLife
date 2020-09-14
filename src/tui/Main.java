/*
This is a colored, console-based implementation of Conway's Game of Life,
a fascinating vision of cellular automata in action.
 Rules: Any live cell with two or three live neighbours survives.
 Any dead cell with three live neighbours becomes a live cell.
 All other live cells die in the next generation. Similarly, all other dead cells stay dead.
*/

package tui;

import static tui.Utils.gameLoop;

public class Main {
    public static void main(String[] args) {
        gameLoop();
    }
}
