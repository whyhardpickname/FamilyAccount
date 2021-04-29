/**
 * @author MarkChern
 * 线程的声明周期
 * 1）出生
 *      新建一个线程
 * 2）就绪
 *      预备被CPU调用
 *      出生前往就绪状态
 *          1. 调用start方法
 *      就绪
 * 3）运行
 *      运行返回就绪
 *          1.执行时间到
 *          2.Yeild()暂停
 *
 *      运行前往阻塞
 *          1.sleep
 *          2.wait
 *          3.join 加塞
 *          4.没锁
 *          5.suspend，已过时
 * 4）阻塞
 *      阻塞前往就绪
 *          1.sleep时间到或被interrupt
 *          2.notify
 *          3.加塞线程结束
 *          4.占用锁的线程结束
 *          5.resume，已过时
 *  5）死亡
 *      运行前往死亡
 *          1.任务完成
 *          2.遇到未处理异常
 *          3.被其他线程stop
 *
 */
public class LifeCycle {
}
