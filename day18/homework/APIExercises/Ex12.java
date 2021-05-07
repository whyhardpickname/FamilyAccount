package homework.APIExercises;

import org.junit.jupiter.api.Test;

/**
 * @author MarkChern
 */
public class Ex12 {
    public static void main(String[] args) {
        String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";
        String toLowerCaseStr = str.toLowerCase();
        int[] countLetters = new int[26];
        char letter;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(letter = toLowerCaseStr.charAt(i))) {
                countLetters[letter - 'a']++;
            }
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < countLetters.length; i++) {
            if (countLetters[i] > max) {
                max = countLetters[i];
                maxIndex = i;
            }
        }
        char c = (char) ('a' + maxIndex);
        System.out.println("出现次数最多的字母: " + c
                + ",出现的次数: " + max);
    }
}
