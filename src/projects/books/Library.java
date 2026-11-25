package projects.books;

import java.io.*;
import java.util.ArrayList;
public class Library {
    private final ArrayList<Book> library;

    public Library() {
        library = new ArrayList<>();
    }

    public void printAllBooks() {
        if (library.isEmpty()) {
            System.out.println("Библиотека пуста");
        } else {
            for (int i = 0; i < library.size(); i++) {
                library.get(i).printInfo();
            }
        }
    }

    public void addBook(Book book) {
        if (book.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Параметры книги не могут быть пустыми!");
        } else {
            library.add(book);
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < library.size(); i++) {
            if (title.equals(library.get(i).getTitle())) {
                library.remove(i);
                System.out.println("Книга успешно удалена.");
                return;
            }
            System.out.println("Книга с таким именем не найдено");
        }
    }

    public void findByAuthor(String author) {
        boolean isFound = false;
        for (Book book : library) {
            if (!isFound) {
                System.out.println("Все книги, написанные автором " + author + ":");
                isFound = true;
            }
            System.out.println(book.getTitle());
        }
        if (!isFound) {
            System.out.println("Книги этого автора не были найдены");
        }
    }

    public void saveToFile(String fileName) {
        try(FileWriter fileWriter = new FileWriter(fileName);) {

            for (int i = 0; i < library.size(); i++) {
                fileWriter.write(library.get(i).getTitle() + ", " + library.get(i).getAuthor() + ", " + library.get(i).getPages() + "\n");
            }
            fileWriter.close();
            System.out.println("Библиотека успешно сохранена");
        }
        catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
    }
    public void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/projects/books/library.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(", ");
                    String title = parts[0];
                    String author = parts[1];
                    int pages = Integer.parseInt(parts[2]);
                    Book newBook = new Book(title, author, pages);
                    library.add(newBook);
                }
                catch (Exception e) {
                    System.out.println("Не удалось прочитать строку: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл библиотеки еще не был создан");
        } catch (IOException e) {
            System.out.println("Файл библиотеки пуст");
        }
    }
}

