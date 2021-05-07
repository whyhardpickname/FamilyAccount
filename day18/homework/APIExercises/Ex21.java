package homework.APIExercises;

/**
 * @author MarkChern
 */
public class Ex21 {
    public static void f1(TEXT tIn, int intIn, Integer integerIn, String strIn) {
        tIn.num = 200;
        tIn.str = "bcd";
        intIn = 200;
        integerIn = 200;
        strIn = "bcd";
    }

    public static void main(String[] args) {
        TEXT tIn = new TEXT(100, "abc");
        int intIn = 100;
        Integer integerIn = 100;
        String strIn = "abc";
        f1(tIn, intIn, integerIn, strIn);
        System.out.println(tIn.num + tIn.str + intIn + integerIn + strIn);
    }
}

class TEXT {
    public int num;
    public String str;

    public TEXT(int num, String str) {
        this.num = num;
        this.str = str;
    }
}
