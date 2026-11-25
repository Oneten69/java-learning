package basics;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 1, 5, 8, 4, 6};
        int numbersSum = 0;
        int numbersMin = numbers[0];
        int numberEvenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
           numbersSum += numbers[i];
        }
        System.out.println(numbersSum);
        for (int i = 0; i < numbers.length; i++) {
            if (numbersMin > numbers[i]) {
                numbersMin = numbers[i];
            }
        }
        System.out.println(numbersMin);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numberEvenCount++;
            }
        }
        System.out.println(numberEvenCount);

    }
}