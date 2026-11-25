package projects.calculator;

import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double substract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        while (true) {
            System.out.println("""
                    Выберите операцию:
                    1 - Сложение
                    2 - Вычитание
                    3 - Умножение
                    4 - Деление
                    0 - Выход""");
            int operation = scanner.nextInt();
            if (operation == 0) {
                break;
            }
            else if (operation > 4 || operation < 0) {
                System.out.println("Невалидная операция");
                continue;
            }
            System.out.println("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.println("Введите второе число: ");
            double num2 = scanner.nextDouble();

            if (operation == 4 && num2 == 0) {
                continue;
            }
            result = switch (operation) {
                case 1 -> add(num1, num2);
                case 2 -> substract(num1, num2);
                case 3 -> multiply(num1, num2);
                case 4 -> divide(num1, num2);
                default -> throw new IllegalStateException("Unreachable");
            };
            System.out.println("Результат: " + result);
        }
        scanner.close();
    }
}