package homework.APIExercises;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author MarkChern
 */
public class Ex1 {
    public static void main(String[] args) {
        System.out.println(reverse());
    }

    public static String reverse() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder line = new StringBuilder("");
        if (scanner.hasNext()) {
            line = new StringBuilder(scanner.next());
            line.reverse();
        }
        return line.toString();
    }
}
