package codewars;
// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d
public class StringEndsWith {
    public static boolean solution(String string, String ending) {
        if (ending.length() > string.length()) {
            return false;
        }
        int dif = string.length() - ending.length();
        String stringEnd = string.substring(dif);
        return stringEnd.equals(ending);
    }
}
