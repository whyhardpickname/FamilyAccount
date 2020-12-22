package day15exercise.ex3;

/**
 * @author MarkChern
 * date 2020/12/22 8:41
 */
public class Test03
{
    {
        System.out.println("a");
    }
    static{
        System.out.println("b");
    }
    Test03(){
        System.out.println("c");
    }
    public static String getOut(){
        try{
            return "1";
        }catch(Exception e){
            return "2";
        }finally{
            return "3";
        }
    }
    public static void main(String[] args) {
        System.out.println(getOut());
        /*
            首先类初始化。
              1）静态块初始化和静态变量初始化
               System.out.println("b");
             然后实例初始化，由于没有new，所以跳过实例初始化
             接着调用方法。
             由于finally中有return，所以其return覆盖try-catch中的return。
             返回3
             综上，输出为
             b
             3
         */
    }
}
