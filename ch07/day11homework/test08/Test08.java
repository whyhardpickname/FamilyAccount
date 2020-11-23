package day11homework.test08;

/**
 * @author MarkChern
 * date 2020/11/24 6:22
 */
public class Test08 {
    public static void main(String[] args) {
        Base b1 = new Base();
        Base b2 = new Sub();
    }
}

class Base {
    Base() {
        method(100);
    }

    public void method(int i) {
        System.out.println("base : " + i);
    }
}

class Sub extends Base {
    Sub() {
        super.method(70);
    }

    public void method(int j) {
        System.out.println("sub : " + j);
    }
}
