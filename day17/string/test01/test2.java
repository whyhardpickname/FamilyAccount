package string.test01;

/**
 * @author MarkChern
 *
 * 字符串的比较
 * 1. == 比较字符串的地址
 * 2.compareTo比较字符串的内容
 *  2.1自然排序 字典排序
 *  2.2 定制排序 重写Comparator接口的compareTo方法
 * 3.不同的语言的排序
 *  3.1 java.collator为自然语言提供搜索和排序的依据
 *  3.2 collator是抽象类，无法直接使用。可以使用子类RuleBasedCollator
 *  3.3 collator提供静态方法getInstance获得子类对象
 *  3.4 getInstance采用操作系统使用的语言
 *  3.5 可以在getInstance的参数里加Local.国家名选择不同国家语言。
 */
public class test2 {
}
