package streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 3, 9, 2, 7, 4);
        List<Integer> result = numbers.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());
        System.out.println(result);

        List<String> names = Arrays.asList("даник", "джамал", "аня");
        List<String> upperNames = names.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperNames);

        List<String> allNames = Arrays.asList("даник", "джамал", "аня", "дима", "оля");
        allNames.stream()
                .filter(n -> n.startsWith("д"))
                .map(n -> n.toUpperCase())
                .forEach(n -> System.out.println(n));

        List<Integer> allNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        allNumbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

        List<String> fruits = Arrays.asList("банан", "яблоко", "арбуз", "абрикос", "апельсин", "банан");
        fruits.stream()
                .filter(n -> n.startsWith("а"))
                .map(n -> n.toUpperCase())
                .forEach(n -> System.out.println(n));

        List<Integer> someNumbers = Arrays.asList(3, 7, 2, 9, 4, 11, 6, 8, 1, 5);
        someNumbers.stream()
                .filter(n -> n > 5)
                .map(n -> n * 3)
                .forEach(n -> System.out.println(n));

        List<String> someNames = Arrays.asList("алия", "даник", "аружан", "джамал", "айгерим");
        List<String> char5Names = someNames.stream()
                .filter(n -> n.length() > 5)
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(char5Names);
    }
}
