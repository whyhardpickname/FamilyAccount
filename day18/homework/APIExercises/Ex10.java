package homework.APIExercises;

import java.text.DecimalFormat;

/**
 * @author MarkChern
 */
public class Ex10 {
    public static void main(String[] args) {
        HandleNum handleNum = new HandleNum();
        System.out.println(handleNum.handleString("999.956", 0));
    }
}

interface Handleable {
    String handleString(String num, int decimals);
}

class HandleNum implements Handleable {
    @Override
    public String handleString(String num, int decimalPlace) {
        StringBuilder d = new StringBuilder(num);
        int dotIndex = d.indexOf(".");
        if (dotIndex == -1) {
            d.append('.');
            dotIndex = d.length() - 1;
        }

        //按四舍五入保留指定小数位数，位数不够用0补充
        int appendZeros = decimalPlace - (d.length() - dotIndex - 1);
        if (appendZeros >= 0) {
            for (int i = 0; i < appendZeros; i++) {
                d.append('0');
            }
            return d.toString();
        }

        //无需进位
        if (d.charAt(dotIndex + decimalPlace + 1) < '5') {
            if (decimalPlace == 0) {
                return d.substring(0, dotIndex + decimalPlace);
            }
            return d.substring(0, dotIndex + decimalPlace + 1);
        }

        //需进位,从后往前找到第一个非9的数
        int i = dotIndex + decimalPlace;
        while (i >= 0 && (d.charAt(i) == '9' || d.charAt(i) == '.')) {
            if (d.charAt(i) != '.') {
                d.setCharAt(i, '0');
            }
            i--;
        }
        if (i >= 0) {
            d.setCharAt(i, (char) (d.charAt(i) + 1));
        }
        else {
            d.insert(0, '1');
            dotIndex++;
        }
        if (decimalPlace == 0) {
            return d.toString().substring(0, dotIndex);
        }
        return d.toString().substring(0, dotIndex + decimalPlace + 1);
    }
}