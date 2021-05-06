package homework.APIExercises;

import sun.text.resources.cldr.naq.FormatData_naq;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * @author MarkChern
 */
public class Ex5 {
    public static void main(String[] args) {
        double f = Math.random() * 100;
        System.out.println(f);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(f));
        System.out.println();
    }
}
