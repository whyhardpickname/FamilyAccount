package day11homework.test09;

/**
 * @author MarkChern
 * date 2020/11/24 6:31
 */
public class Test09 {
    public static void main(String[] args) {
        Other o = new Other();
        new Test09().addOne(o);
        System.out.println(o.i);
    }

    public void addOne(final Other o){
        o.i++;
    }
}
class Other{
    public int i;
}
