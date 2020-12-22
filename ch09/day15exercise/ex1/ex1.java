package day15exercise.ex1;

/**
 * @author MarkChern
 * date 2020/12/22 8:37
 */
public class ex1
{
    public static void main(String[] args) {
        int test = test(3,5);
        System.out.println(test);//输出8
    }

    public static int test(int x, int y){
        int result = x;
        try{
            if(x<0 || y<0){
                return 0;
            }
            result = x + y;
            return result;
        }finally{
            result = x - y;
        }
    }
}
