package dynamicProxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname JdkProxyExample
 * @Description TODO
 * @Date 2020/4/18 22:03
 * @Created by flzhang
 */
public class JdkProxyExample implements InvocationHandler {
    Object target=null;
    //实现代理对象和真实对象的关系，用bind方法实现
    public Object bind(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    /**实现代理方法逻辑
     * @param proxy 代理对象 method args 参数列表
    */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Good job before");
        Object obj=method.invoke(target,args);
        System.out.println("Good job after");
        return obj;
    }
    public static void main(String[] args){
        JdkProxyExample jdkProxy= new JdkProxyExample();
        HelloWord Proxy= (HelloWord)jdkProxy.bind(new HelloWordImpl());
        Proxy.sayHelloWord();
    }

}
