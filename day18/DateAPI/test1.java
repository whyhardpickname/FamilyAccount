package DateAPI;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * @author MarkChern
 * 1. Date
 *  1)Date()
 *  2)Date(毫秒)
 * 2. Calendar
 *  1）get()
 * 3. TimeZone
 * 4.SimpleDateFormat
 *
 * 新版时间
 * DateTime
 * LocalTime
 * LocalDateTime
 *
 * 1.now()
 * 2.getxxx
 * 3. of()
 * 4. plus, minus
 *
 * DateFormatter
 *
 */
public class test1 {
    @Test
    public void test1() {
        Date date = new Date();
        System.out.println(date);
    }

    @Test
    public void test2() {
        long time = System.currentTimeMillis();
        System.out.println(time);
    }

    @Test
    public void test3() {
        long time = 1620167358021L;
        System.out.println(new Date(time));
    }

    @Test
    public void test4() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日HH时");
        System.out.println(format.format(new Date()));
    }

    @Test
    public void test5() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter
                                            .ofLocalizedDateTime(FormatStyle.LONG)
                                            .withZone(ZoneId.systemDefault());
        String str = formatter.format(now);
        System.out.println(str);
    }
}
