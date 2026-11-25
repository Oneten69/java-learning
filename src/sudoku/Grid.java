package sudoku;

import java.util.Arrays;

public class Grid {
    private final int[][] grid;

    public Grid() {
        this.grid = new int[9][9];
    }
    public int getNumber(int a, int b) {
        return grid[a][b];
    }
    public void getGrid() {
        for (int i = 0; i < grid.length; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
    }
    public int getRows() { return grid.length; }
    public void getRowsValue() {
        int[] array = new int[9];
        for (int i = 0; i < grid.length; i ++) {
            int j = 0;
            array[i] = grid[i][j];
            j++;
        }
    }
    public int getCols() {return grid[0].length;}
    public void setValue(int x, int y, int number) {
        grid[x-1][y-1] = number;
    }
}
