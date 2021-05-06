package homework.APIExercises;

/**
 * @author MarkChern
 */
public class Ex7 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("non"));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        while (i < s.length() - i - 1) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
