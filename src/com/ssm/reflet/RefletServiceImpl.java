package com.ssm.reflet;

/**
 * @Classname RefletServiceImpl
 * @Description TODO
 * @Date 2020/4/18 20:41
 * @Created by flzhang
 */
public class RefletServiceImpl {
    public void sayHello(String name){
        System.err.println("Hello "+name);
    }
    //通过反射的方法构建这个函数
    public RefletServiceImpl getInstance(){
        RefletServiceImpl object =null;
        try {
            object=(RefletServiceImpl)Class.forName("com.ssm.reflet.RefletServiceImpl").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

}
