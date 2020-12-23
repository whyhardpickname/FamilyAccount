package day15exercise.ex5;

import java.io.IOException;

/**
 * @author MarkChern
 * date 2020/12/22 8:49
 */
public class Test05
{
    public static void main(String[] args) {
        int a = -1;
        try{
            if(a>0){
                throw new RuntimeException("");
            }else if(a<0){
                throw new IOException("");
            }else{
                return ;
            }
        }catch(IOException ioe){
            System.out.println("IOException");
        }catch(Throwable e){
            System.out.println("Throwable");
        }finally{
            System.out.println("finally");
        }
    }
    /*
    由于Throwable是IOEXception的父类,所以输出为
    IOException
    Throwable
    finally
     */
}
