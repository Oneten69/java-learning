package sudoku;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Game {
    public static void setValue(int x, int y, int number, int[][] list) {
        if (list[x][y] == 0) {
            list[x - 1][y - 1] = number;
            System.out.println("Правильно");
        }
        else {
            System.out.println("На этой позиции уже есть число!");
        }
    }
    public static void printGrid(int[][] array2d) {
        int countForRows = 0;
        for (int[] array : array2d) {
            int countForCols = 0;
            for (int ints : array ) {
                if(ints == 0) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(ints + " ");
                }
                countForCols++;
                if(countForCols % 3 == 0 && countForCols < 7) {
                    System.out.print("| ");
                }
            }
            System.out.println(" ");
            countForRows++;
            if(countForRows % 3 == 0 && countForRows < 7) {
                System.out.println("— — — — — — — — — — — ");
            }
        }
    }
    public static int[][] deleteGrid(int[][] array2d) {
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                double selectedNum = ThreadLocalRandom.current().nextDouble(0, 1);
                if (selectedNum > 0.5) {
                    array2d[i][j] = 0;
                }
            }
        }
        return array2d;
    }
    public static int[][] copyGrid(int[][] fullGrid) {
        int[][] emptyGrid = new int[9][9];
        for (int i = 0; i < fullGrid.length; i++) {
            for (int j = 0; j < fullGrid[i].length; j++) {
                emptyGrid[i][j] = fullGrid[i][j];
            }
        }
        return emptyGrid;
    }
    public static void fillRows(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                int num = ThreadLocalRandom.current().nextInt(1, 9);
                for (int k = 0; k < sudoku[j].length; k++) {

                }
            }
        }
    }
//    public static void random(Grid grid) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                int number = ThreadLocalRandom.current().nextInt(1, 10);
//                grid.setValue(i, j, number);
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("""
                    1.Играть
                    2.Выход
                    3.ТЕСТ
                    """);
            String option = scanner.nextLine();

            switch (option) {
                case "1" -> {
                    int[][] sudokuComplete = {
                            {4, 3, 5, 2, 6, 9, 7, 8, 1},
                            {6, 8, 2, 5, 7, 1, 4, 9, 3},
                            {1, 9, 7, 8, 3, 4, 5, 6, 2},
                            {8, 2, 6, 1, 9, 5, 3, 4, 7},
                            {3, 7, 4, 6, 8, 2, 9, 1, 5},
                            {9, 5, 1, 7, 4, 3, 6, 2, 8},
                            {5, 1, 9, 3, 2, 6, 8, 7, 4},
                            {2, 4, 8, 9, 5, 7, 1, 3, 6},
                            {7, 6, 3, 4, 1, 8, 2, 5, 9}
                    };

                    int[][] sudoku = deleteGrid(copyGrid(sudokuComplete));
                    boolean isPlaying = true;
                    int lifes = 3;
                    while (isPlaying && lifes > 0) {
                        printGrid(sudoku);
                        System.out.println("Оставшиеся жизни: " + lifes);
                        System.out.println("Введите координаты и число (строка, столбец, число): ");
                        String input = scanner.nextLine();
                        String[] parts = input.split("\\s+");
                        try {
                            int x = Integer.parseInt(parts[0]);
                            int y = Integer.parseInt(parts[1]);
                            int number = Integer.parseInt(parts[2]);
                            if (number == sudokuComplete[x - 1][y - 1]) {
                                setValue(x, y, number, sudoku);
                            } else {
                                System.out.println("Неправильно");
                                lifes--;
                            }
                            if (lifes == 0) {
                                System.out.println("Вы проиграли");
                            } else if (Arrays.deepEquals(sudoku, sudokuComplete)) {
                                System.out.println("Вы победили!");
                                isPlaying = false;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Введите корректное число!");
                        }
                    }
                }
                case "2" -> {
                    System.out.println("Выход...");
                    isRunning = false;
                }
                case "3" -> {
                    int[][] sudoku = new int[9][9];
                    fillRows(sudoku);
                    for (int i = 0; i < sudoku.length; i++) {
                        System.out.println(Arrays.toString(sudoku[i]));
                    }
                }
                default -> System.out.println("Введите корректное число!");
            }
        }
    }
}
