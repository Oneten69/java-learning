package basics;

public class Methods {
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i : numbers) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i : numbers) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
    public static boolean isEven(int number) {
            return number % 2 == 0;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(min(numbers));
        System.out.println(isEven(4));
        System.out.println((max(numbers)));
    }
}
