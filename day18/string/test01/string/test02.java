package string.test01.string;

/**
 * @author MarkChern
 * 1. 常量池和堆中的String对象
 *   1）当String类变量直接赋值字符串常量初始化，对象保存在常量池。
 *      例如：String str = "hello";
 *   2）当String类变量通过new赋值初始化，对象保存在堆中。
 *      例如：String str = new String("hello");
 * 2. String类变量通过new赋值初始化有几个对象？
 *   答：两个。通过new赋值初始化，字符串数组保存在常量池中，而堆通过字符串数组变量引用常量池中的数组。
 * 3.拼接字符串
 *  1）变量 + 常量：生成的新字符串变量在堆
 *  2）常量 + 常量：生成的新字符串变量在常量池
 *  3）使用final关键字可以使变量转为常量
 *  3）XXX.intern在常量池
 * 4.判断是否是空字符串？
 *  1）先判断是否为空指针，再判断长度是否为零。
 *  2）调用空字符串的equal方法。
 */
public class test02 {
    public static void main(String[] args) {

    }
}
