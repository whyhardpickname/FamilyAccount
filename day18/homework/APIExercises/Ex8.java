package homework.APIExercises;

/**
 * @author MarkChern
 */
public class Ex8 {
    public static void main(String[] args) {
        System.out.println(isLegal("jABkksdlj3j52"));
    }

    public static boolean isLegal(String password) {
        char[] arr = password.toCharArray();
        int uppercases = 0;
        if (arr.length < 9) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!Character.isAlphabetic(arr[i])
                    && !Character.isDigit(arr[i])) {
                return false;
            }

            if (Character.isUpperCase(arr[i])) {
                uppercases++;
            }
        }
        if (uppercases < 2) {
            return false;
        }
        return true;
    }

}
