package test17;

/**
 * @author MarkChern
 * 单例设计模式
 *
 * 单例：某个类的实例只有一个。
 *
 *  如何构造单例？
 *  1。饿汉式：无论是否使用单例对象，提前构造实例。
 *      1）枚举
 *      2）先构造器私有化，再通过全局静态变量引用。
 *      3）构造器私有化，私有单例，再用静态方法返回。
 *  2. 懒汉式：延迟创建对象，当有需要时再创建对象并返回。
 *      1）构造器私有化，私有单例，再用静态方法返回。需要考虑线程安全和性能
 *      2）使用内部类保存唯一实例，再用静态方法返回。
 */
public class Test17 {
    public static void main(String[] args) {
        /*Single1 single1 = Single1.INSTANCE;
        Single1 single2 = Single1.INSTANCE;
        System.out.println(single1 == single2);

        Single2 single21 = Single2.single2;
        Single2 single22 = Single2.single2;
        System.out.println(single21 == single22);

        Single3 single31 = Single3.getInstance();
        Single3 single32 = Single3.getInstance();
        System.out.println(single31 == single32);*/


//        final LazySingle[] lazySingle1 = new LazySingle[1];
//        final LazySingle[] lazySingle2 = new LazySingle[1];
//
//        Thread t1 = new Thread(){
//            @Override
//            public void run() {
//                lazySingle1[0] = LazySingle.getInstance();
//            }
//        };
//        Thread t2 = new Thread(){
//            @Override
//            public void run() {
//                lazySingle2[0] = LazySingle.getInstance();
//            }
//        };
//        t1.start();
//        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(lazySingle1[0] == lazySingle2[0]);
//    }

        LazyInner lazyInner1 = LazyInner.getInstance();
        LazyInner lazyInner2 = LazyInner.getInstance();
        System.out.println(lazyInner1 == lazyInner2);
    }
}
enum Single1 {
    INSTANCE
}

class Single2 {
    public static final Single2 single2 = new Single2();

    private Single2() {
    }
}

class Single3 {
    private static final Single3 INSTANCE = new Single3();

    private Single3() {

    }

    public static Single3 getInstance() {
        return INSTANCE;
    }
}

class LazySingle {
    private static LazySingle lazySingle;

    private LazySingle() {

    }

    public static LazySingle getInstance() {
        if (lazySingle == null) { //性能优化
            synchronized (LazySingle.class) { //线程安全问题
                if (lazySingle == null) {
                    lazySingle = new LazySingle();
                }
            }
        }
        return lazySingle;
    }
}

class LazyInner {
    private LazyInner() {}

    private static class Inner {
        public static final LazyInner INSTANCE = new LazyInner();
    }

    public static LazyInner getInstance() {
        return Inner.INSTANCE;
    }
}
