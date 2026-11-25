package collections;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Даник", 90);
        scores.put("Джамал", 100);
        scores.put("Гена", 80);
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
        String bestPlayer = null;
        int bestScore = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > bestScore) {
                bestScore = entry.getValue();
                bestPlayer = entry.getKey();
            }
        }
        if (bestPlayer == null) {
            System.out.println("Список пуст.");
        } else {
            System.out.println("Лучший игрок это " + bestPlayer + " с общим числом очков в " + bestScore);
        }
        HashSet<String> names = new HashSet<>();
        names.add("Данчо");
        names.add("Данияр");
        names.add("Данчо");
        System.out.println(names.size());

        List<String> words = new ArrayList<>();
        words.add("яблоко");
        words.add("банан");
        words.add("яблоко");
        words.add("груша");
        words.add("банан");
        words.add("банан");
        HashSet<String> uniqueWords = new HashSet<>();
        HashMap<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            uniqueWords.add(words.get(i));
            if (countMap.containsKey(words.get(i))) {
                int current = countMap.get(words.get(i));
                countMap.put(words.get(i), current + 1 );
            }
            else {
                countMap.put(words.get(i), 1 );
            }
        }
        int uniqueCount = uniqueWords.size();
        System.out.println("Уникальных слов: " + uniqueCount);
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " — " + entry.getValue());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(7);
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            uniqueNumbers.add(numbers.get(i));
        }
        System.out.println(uniqueNumbers);
        System.out.println(uniqueNumbers.size());

        List<Integer> grades = new ArrayList<>();
        grades.add(5);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(3);
        grades.add(5);
        HashMap<Integer, Integer> gradesCount = new HashMap<>();
        for (int i = 0; i < grades.size(); i++) {
            if (gradesCount.containsKey(grades.get(i))) {
                int current = gradesCount.get(grades.get(i));
                gradesCount.put(grades.get(i), current + 1 );
            }
            else {
                gradesCount.put(grades.get(i), 1 );
            }
        }
        for (Map.Entry<Integer, Integer> entry : gradesCount.entrySet()) {
            System.out.println(entry.getKey() + " — " + entry.getValue());
        }
        List<String> list1 = new ArrayList<>();
        list1.add("кот");
        list1.add("пёс");
        list1.add("рыба");
        list1.add("птица");

        List<String> list2 = new ArrayList<>();
        list2.add("рыба");
        list2.add("змея");
        list2.add("кот");
        list2.add("черепаха");
        HashSet<String> generalWords = new HashSet<>();
        for (int i = 0; i < list1.size() ; i++) {
            if (list2.contains(list1.get(i))) {
                generalWords.add(list1.get(i));
            }
        }
        System.out.println(generalWords);
    }
}
