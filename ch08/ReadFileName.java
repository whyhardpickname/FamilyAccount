import java.io.File;
import java.util.regex.Pattern;

/**
 * @author MarkChern
 * date 2020/12/9 7:34
 */
public class ReadFileName
{
    public static void main(String[] args)
    {
        File dir = new File("E:\\atguiguJava视频\\ssg-Java全套教程-1");
        File[] files = dir.listFiles();

        for (File file : files)
        {
            String fileName = file.getName();
            if (fileName.contains("day15"))
            {
                int index = fileName.indexOf("day15");
                System.out.println(fileName.substring(index));
            }
        }
    }
}
