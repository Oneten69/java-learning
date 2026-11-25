package projects.books;
import java.util.Scanner;

public class Books {
    public static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (true) {
            String string = scanner.nextLine();
            try {
                return Integer.parseInt(string);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Вы ввели не число. Попробуйте еще раз:");
            }
        }
    }
    public static void main(String[] args) {

        Library library = new Library();
        library.loadFromFile();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("""
                    1. Добавить книгу
                    2. Удалить книгу по названию
                    3. Найти книги по автору
                    4. Показать все книги
                    5. Выйти""");
            String option = scanner.nextLine();
            switch (option) {
                case "1" -> {
                    System.out.println("Введите название книги: ");
                    String bookTitle = scanner.nextLine();
                    while (bookTitle.isBlank()) {
                        System.out.println("Название книги не может быть пустым! Введите снова:");
                        bookTitle = scanner.nextLine();
                    }
                    System.out.println("Введите автора книги: ");
                    String bookAuthor = scanner.nextLine();
                    while (bookAuthor.isBlank()) {
                        System.out.println("Поле автора не может быть пустым! Введите снова:");
                        bookAuthor = scanner.nextLine();
                    }
                    int bookPages = readInt(scanner, "Введите количество страниц: ");
                    Book newBook = new Book(bookTitle, bookAuthor, bookPages);
                    library.addBook(newBook);
                }
                case "2" -> {
                    System.out.println("Введите название книги которую хотите удалить: ");
                        String bookDelete = scanner.nextLine();
                        if(!bookDelete.isBlank()) {
                            library.removeBook(bookDelete);
                        }
                        else {
                            System.out.println("Название не может быть пустым!");
                        }
                }
                case "3" -> {
                    System.out.println("Введите автора, книги которого хотите найти: ");
                    String authorSearch = scanner.nextLine();
                    library.findByAuthor(authorSearch);
                }
                case "4" -> library.printAllBooks();
                case "5" -> {
                    library.saveToFile("library.txt");
                    System.out.println("Выход...");
                    isRunning = false;
                }
                default -> System.out.println("Неверный вариант, попробуйте снова.");
            }
        }
    }
}
