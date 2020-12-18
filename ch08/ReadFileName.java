import java.io.File;

/**
 * @author MarkChern
 * date 2020/12/9 7:34
 */
public class ReadFileName
{
    public static void main(String[] args)
    {
        File dir = new File("E:\\atguiguJava\\ssgJava1");
        System.out.println(dir.exists());
        File[] files = dir.listFiles();
        String prefix = "day16";

        for (File file : files)
        {
            String fileName = file.getName();
            if (fileName.contains(prefix))
            {
                int index = fileName.indexOf(prefix);
                System.out.println(fileName.substring(index));
            }
        }
    }
}
