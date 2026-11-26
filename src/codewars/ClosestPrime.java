package codewars;
// https://www.codewars.com/kata/5a946d9fba1bb5135100007c
public class ClosestPrime {
    public static int compare(int[] list) {
        int sumPlusStep = 0;
        int sum = 0;

        for(int element : list) {
            sumPlusStep += element;
            sum += element;
        }
        while (!isPrime(sumPlusStep)) {
            sumPlusStep++;

        }
        return sumPlusStep - sum;
    }
    public static boolean isPrime(int sum) {
        for (int i = 2; i <= Math.floor(Math.sqrt(sum)); i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
