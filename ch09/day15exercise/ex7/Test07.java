package day15exercise.ex7;

/**
 * @author MarkChern
 * date 2020/12/23 6:20
 */
public class Test07
{
    public static int aMethod(int i)throws Exception{
        try{
            return i / 10;
        }catch(Exception ex){
            throw new Exception("exception in aMethod");
        }finally{
            System.out.println("finally");
        }
    }
    public static void main(String[] args) {
        try {
            aMethod(0);
        } catch (Exception e) {
            System.out.println("exception in main");
        }
    }
    /*
        finally
     */
}
