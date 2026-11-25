package sudoku;
import java.util.concurrent.ThreadLocalRandom;
public class SudokuGenerator {
    private int number;


    public void random(int[][] grid) {
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                int number = ThreadLocalRandom.current().nextInt(1, 10);
                grid[i][j] = number;
            }
        }
    }
}

