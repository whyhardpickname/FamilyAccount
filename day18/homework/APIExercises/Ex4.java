package homework.APIExercises;

import java.util.Scanner;

/**
 * @author MarkChern
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String d = scanner.nextLine();

        s = s.replaceAll(d, "");
        System.out.println(s);
    }
}
