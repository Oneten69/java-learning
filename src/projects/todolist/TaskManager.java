package projects.todolist;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class TaskManager {
    private final ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
    }
    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Ваш список задач пуст.");
        }
        else {
            System.out.println("Ваш список задач:");
            for (Task task : tasks) {
                task.printInfo();
            }
        }
    }
    public void printPending() {
        boolean found = false;
        if (tasks.isEmpty()) {
            System.out.println("Ваш список задач пуст.");
        }
        else {
            for (Task task : tasks) {
                if (!task.isCompleted()) {
                    task.printInfo();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Все ваши задачи выполнены!");
            }
        }
    }
    public void completeTask(String title) {
        boolean found = false;
        for (Task task : tasks) {
            if (Objects.equals(title, task.getTitle())) {
                found = true;
                if (!task.isCompleted()) {
                    task.complete();
                    System.out.println("Задача успешно выполнена.");
                }
                else {
                    System.out.println("Эта задача уже выполнена.");
                }
                break;
            }
        }
        if(!found) {
            System.out.println("Такой задачи не найдено.");
        }
    }
    public void saveToFile(String fileName) {
        try(FileWriter fileWriter = new FileWriter(fileName);) {

            for (Task task : tasks) {
                fileWriter.write(task.getTitle() + ", " + task.getDescription() + ", " + task.isCompleted() + "\n");
            }
            System.out.println("Список задач успешно сохранен.");
        }
        catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
    }
    public void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/projects/todolist/TaskManager.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(", ");
                    String title = parts[0].trim();
                    String description = parts[1].trim();
                    boolean isCompleted = Boolean.parseBoolean(parts[2].trim());
                    Task task = new Task(title, description, isCompleted);
                    tasks.add(task);
                }
                catch (Exception e) {
                    System.out.println("Не удалось прочитать строку: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл списка не был найден");
        } catch (IOException e) {
            System.out.println("Файл списка пуст");
        }
    }
}