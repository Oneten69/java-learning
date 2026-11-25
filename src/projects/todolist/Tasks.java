package projects.todolist;
import java.util.Scanner;
public class Tasks {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        taskManager.loadFromFile();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("""
                    1. Добавить задачу
                    2. Отметить задачу выполненной
                    3. Показать все задачи
                    4. Показать невыполненные задачи
                    5. Выйти
                    """);
            String option = scanner.nextLine();
            switch (option) {
                case "1" -> {
                    System.out.println("Введите название задачи: ");
                    String taskName = scanner.nextLine();
                    System.out.println("Введите описание задачи: ");
                    String taskDescription = scanner.nextLine();
                    Task newTask = new Task(taskName, taskDescription, false);
                    taskManager.addTask(newTask);
                }
                case "2" -> {
                    System.out.println("Введите название задачи: ");
                    String taskToComplete = scanner.nextLine();
                    System.out.println("Поиск...");
                    taskManager.completeTask(taskToComplete);
                }
                case "3" -> taskManager.printAllTasks();
                case "4" -> taskManager.printPending();
                case "5" -> {
                    System.out.println("Выход...");
                    isRunning = false;
                    taskManager.saveToFile("src/Projects.Books.ToDoList/TaskManager.txt");
                }
                default -> System.out.println("Введите корректное число!");
            }
        }
    }
}
