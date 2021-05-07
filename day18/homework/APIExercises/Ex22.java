package homework.APIExercises;

import java.io.UnsupportedEncodingException;

/**
 * @author MarkChern
 */
public class Ex22 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "中国";
        System.out.println(str.getBytes("UTF-8").length);
        System.out.println(str.getBytes("GBK").length);
        System.out.println(str.getBytes("ISO-8859-1").length);
        System.out.println(new String(str.getBytes("UTF-8"), "UTF-8"));
        System.out.println(new String(str.getBytes("GBK"), "GBK"));
        System.out.println(new String(str.getBytes("ISO-8859-1"), "ISO-8859-1"));
    }
}
