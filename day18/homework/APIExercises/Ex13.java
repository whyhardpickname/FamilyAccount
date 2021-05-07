package homework.APIExercises;

import javax.xml.transform.Source;
import java.util.Arrays;

/**
 * @author MarkChern
 */
public class Ex13 {
    public static void main(String[] args) {
        String str = "1.hello2.world3.java4.string";
        String[] words = str.substring(2).split("\\d\\.");
        System.out.print("[");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            System.out.print(
                    (i < words.length - 1) ? ", " : "");
        }
        System.out.println("]");
    }
}
