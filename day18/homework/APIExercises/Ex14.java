package homework.APIExercises;

import org.junit.jupiter.api.Test;

/**
 * @author MarkChern
 */
public class Ex14 {
    public static void main(String[] args) {
        String str = new String("world");
        char[] ch = new char[]{'h','e','l','l','o'};
        change(str,ch);
        System.out.println(str);
        System.out.println(String.valueOf(ch));
    }
    public static void change(String str, char[] arr){
        str = "change";
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';
    }
}
