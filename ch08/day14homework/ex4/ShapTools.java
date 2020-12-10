package day14homework.ex4;

import javax.sound.midi.Soundbank;

/**
 * @author MarkChern
 * @
 * date 2020/12/10 7:40
 */
public class ShapTools
{
    @Deprecated
    public static void printRectangle()
    {
        printRectangle(5, 5, "*");
    }

    /**
     *
     * @param line 行数
     * @param column 列数
     * @param sign 填充符号
     * @return 返回一个用sign组成的line行column列的矩形图案
     */
    public static void printRectangle(int line, int column, String sign)
    {
        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print(sign);
            }
            System.out.println();
        }
    }
}
