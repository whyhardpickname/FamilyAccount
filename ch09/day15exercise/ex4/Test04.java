package day15exercise.ex4;

/**
 * @author MarkChern
 * date 2020/12/22 8:48
 */
public class Test04
{
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test(){
        try{
            return ++i;
        }finally{
            return ++i;
        }
    }
    /*
    由于finally有return，所以覆盖返回值
    输出为
    2
     */
}
