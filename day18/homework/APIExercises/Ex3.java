package homework.APIExercises;

import java.util.Scanner;

/**
 * @author MarkChern
 */
public class Ex3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        String t = scanner.nextLine();
//        System.out.println(strstr(s, t));

        Scanner input = new Scanner(System.in);
        System.out.print("请输入大字符串：");
        String big = input.next();

        System.out.print("请输入小字符串：");
        String small = input.next();

        int index;
        int count = 0;
        while((index = big.indexOf(small))!=-1){
            big = big.substring(index+small.length());
            count++;
        }
        System.out.println(small + "出现了" +count + "次");

        input.close();
    }
    public static int strstr(String s, String t) {
        int count = 0;
        int index = 0;
        while ((index = s.indexOf(t, index)) != -1) {
            index++;
            count++;
        }
        return count;
    }
}
