package lambda;

/**
 * @Classname lambda.LambdaDemo
 * @Description TODO
 * @Date 2020/5/24 21:15
 * @Created by flzhang
 */

import java.util.PriorityQueue;
import java.util.function.Function;

/**
 * lambda 表达式重写的必须式
 */
public class LambdaDemo {
    public static void lambdaTest() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnn>>>>");
            }
        }).start();
    }
    public static void lambdaTest2() {
        new Thread(()-> {System.out.println("runnn2>>>>"); }).start();
    }
    public  static  void testUpper(){
        String result=upper((x)->{return x.toUpperCase();},"hello");
        System.out.println(result);
    }
    public static String upper(Function<String,String> func,String str){
        return func.apply(str);
    }

    public static void main(String[] args) {
        testUpper();
        //lambdaTest();
        //lambdaTest2();
    }
}
