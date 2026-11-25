package projects.guessnumber;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Game {
    public static boolean numCheck(int inputNum, int correctNum) {
        if (correctNum == inputNum) {
            System.out.println("Вы победили!");
            return true;
        } else if (correctNum < inputNum) {
            System.out.println("Меньше");
        } else {
            System.out.println("Больше");
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("""
                    Угадайте число!
                    1.Играть
                    2.Выйти
                    """);
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> {
                    int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
                    int attempts = 7;
                    while(true) {
                        System.out.println("Количество попыток: " + attempts);
                        System.out.println("Угадай число: ");
                        try {
                            int num = Integer.parseInt(scanner.nextLine());
                            if (numCheck(num, randomNum)) break;
                            attempts--;
                            if (attempts == 0) {
                                System.out.println("Вы проиграли, загаданное число: " + randomNum);
                                break;
                            }
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Введите корректное число!");
                        }

                    }
                }
                case "2" -> {
                    isRunning = false;
                }
                default -> {
                    System.out.println("Введите корректное число!");
                }
            }
        }
    }
}
