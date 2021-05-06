package string.test01;

/**
 * @author MarkChern
 *
 * String类位于Java的lang包。
 * String类的特点
 * 1. String类不能被继承，因为它被final修饰。
 * 2. String类不可变，换句话说，String类对象不能被修改，只要修改字符串，就会产生新对象。
 * 3.String类不可变的特性，使得我们可以将字符串存入常量池。而常量池的数据可以共享。
 *
 * 字符串常量池在哪？
 * 1.jdk1.6以及之前在方法区
 * 2.jdk1.7，挪到堆中，即在堆中单独划分一块空间来存字符串常量。
 * 3.jdk1.8：从堆中挪到“元空间meta space”，类似方法区。
 * 4.Sring类的底层存储
 * （1）jdk1.9之前，char[]
 * （2）jdk1.9之后，byte[]
 * 5.String对象如何实现不变性？
 * 1）底层存储的数组用final修饰，使得无法引用其它数组或扩容。
 * 2）底层存储的数组是私有的，并且不提供修改器。
 * 3）所以方法都是返回一个新字符串。
 */
public class test1 {
}
