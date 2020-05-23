package com.ssm.reflet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Classname RefletServiceImpl2
 * @Description TODO
 * @Date 2020/4/18 20:49
 * @Created by flzhang
 */
public class RefletServiceImpl2 {
    String name;
    public RefletServiceImpl2(String name){
        this.name=name;
    }
    public void sayHello(String name){
        System.err.println("Hello "+name);
    }
    //带参数的反射实现

    public Object reflet() {
        RefletServiceImpl object =null;
        try {
            object=(RefletServiceImpl)Class.forName("com.ssm.reflet.RefletServiceImpl").newInstance();
            Method method =object.getClass().getMethod("sayHello",String.class);
            method.invoke(object,"哈哈哈");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
    public static void main(String[] args){
        RefletServiceImpl2 a=new RefletServiceImpl2("张三");
        a.reflet();
    }
}
