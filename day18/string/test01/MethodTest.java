package string.test01;

/**
 * @author MarkChern
 *
 * 第一组方法
 * str.length() 返回字符个数
 * str.toUpperCase()
 * str.tolowerCase()
 * str.trim() 去除字符串前导和后导空字符
 * str.concat()
 * 所有方法均返回新字符串，不改变原字符串。
 *
 * 第二组方法 与char相关
 * str.charAt(index)
 * str.toCharArray()
 * String(char[]) 字符数组转字符串
 * String(char[], int offset, int count) 从offset开始的子字符数组转字符串
 *
 * 第三组  与字节数组相关
 * Byte[] getBytes()
 * Byte[] getBytes(编码方式)
 *
 * new String(字节数组，编码方式)
 *                  读取字节数
 * UTF-8 0xxx       1
 *       11xxx      2
 *       111xxx     3
 *       1111xxx    4
 *
 * 第四组
 * booblean str.startsWith()
 * boolean str.endsWith()
 *
 * 第五组 查找
 * booblean str.contains()
 * int str.indexOf() 返回匹配的第一个，否则返回-1
 * int str.lastIndexOf() 返回匹配的最后一个，否则返回-1
 *
 * 第六组 截取
 * str.substring(int begin)
 * str.substring(int begin, int end)
 *
 * 第七组 正则表达式
 * str.matches()
 *
 * 第八组 替换
 * str.replace(target, value)
 * str.replaceAll(regex, replacement)
 * str.replaceFirst(regex, replacement)
 *
 * 第九组 拆分
 * split()
 * . \ | 在正则中有特殊含义，需添加前缀“\\"转成普通符号
 *
 * 可变序列 StringBuffer和StringBuilder
 * StringBuffer 线程安全，性能较低
 * StringBuilder 线程不安全，性能较高
 *
 * append()
 * delete(int start, int end)
 * deleteCharAt(int index)
 * insert(int start)
 * reverse()
 * setCharAt(int index)
 *
 */
public class MethodTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
    }
}
