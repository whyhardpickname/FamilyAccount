package day11homework.test07;

public class Test07 {
        static int x, y, z;
        static {
            int x = 5;
            x--;
        }
        static {
            x--;
        }
        public static void main(String[] args) {
            System.out.println("x=" + x);
            z--;
            method();
            System.out.println("result:" + (z + y + ++z));
        }
        public static void method() {
            y = z++ + ++z;
        }
}
