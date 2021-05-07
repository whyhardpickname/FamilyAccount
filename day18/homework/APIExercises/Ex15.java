package homework.APIExercises;

import org.junit.jupiter.api.Test;

/**
 * @author MarkChern
 */
public class Ex15 {
    @Test
    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = 128;
        int i3 = 128;
        int i4 = 128;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i1 == i3);
    }
}
