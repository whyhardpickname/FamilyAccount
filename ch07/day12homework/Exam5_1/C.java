package day12homework.Exam5_1;

/**
 * @author MarkChern
 * date 2020/11/28 6:48
 */
abstract class A
{
    int numa = 10;

    abstract void showA();
}

abstract class B extends A
{
    int numb = 20;
    abstract void showB();
}

public class C extends B
{
    int numc = 30;

    @Override
    void showA()
    {
        System.out.println(numa);
    }

    @Override
    void showB()
    {
        System.out.println(numb);
    }

    void showC()
    {
        System.out.println(numc);
    }

    public static void main(String[] args)
    {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
