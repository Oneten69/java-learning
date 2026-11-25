package basics;

public class Array2dAndRecursion {
    // recursion
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    public  static void main(String[] args) {
        // 2d array
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // sum of array elements
        int sumNums = 0;
        for (int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[row].length; col++) {
                sumNums +=  grid[row][col];
            }
        }
        System.out.println(sumNums);
        System.out.println(sum(2));
    }
}
