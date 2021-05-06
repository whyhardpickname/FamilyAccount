package homework.APIExercises;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author MarkChern
 */
public class Ex6 {
    public static void main(String[] args) {
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = "";
            for (int j = 0; j < i ; j++) {
                strings[i] += j;
            }
        }

        System.out.println(Arrays.toString(strings));
        int i = 0;
        while (i < strings.length) {
            if (strings[i].length() > 5) {
                System.arraycopy(strings, i + 1, strings, i, strings.length - i - 1);
                strings = Arrays.copyOf(strings, strings.length - 1);
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(strings));
    }

    public static String[] remove(String[] strs, int maxlen) {
        String[] newstrs = new String[strs.length];
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() <= maxlen) {
                newstrs[count++] = strs[i];
            }
        }
        return newstrs;
    }
}
