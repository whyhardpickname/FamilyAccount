package homework.APIExercises;

import java.util.Scanner;

/**
 * @author MarkChern
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isQQ(str));
    }

    public static boolean isQQ(String str) {
        return str.matches("[1-9]\\d{4,11}+");
    }
}
