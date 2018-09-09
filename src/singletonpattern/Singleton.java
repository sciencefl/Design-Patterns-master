package singletonpattern;
/**
 * 单例模式：确保一个类只有一个实例，并提供一个全局访问点
 * 单例模式中确保线程安全的方法
	1.同步getinstance（）方法
	如果getinstance（）方法的性能对应用程序不是很关键，可以什么都不做
	2.急切实例化
	在定义静态变量的时候直接初始化，而不是延迟初始化的方法
	3.双重检查加锁
	首先检查是否实例已经创建了，如果没有创建，“才”进行一次同步，这样，只有一次同步，这正是我们想要的。
	单例模式必备三要素
	1.一个私有的构造器（用于初始化），一个私有的静态变态的对象变量和一个全局的静态方法。
 * @author Stone
 *
 */
public class Singleton {
	
	private  static  volatile Singleton uniqeInstance; //因为静态方法只能访问静态变量和静态方法 
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton getInstance0() {
		if(uniqeInstance==null) {
			uniqeInstance=new Singleton();
		}
		return uniqeInstance;
	}
	public static synchronized Singleton getInstance1() {
		if(uniqeInstance==null) {
			uniqeInstance=new Singleton();
		}
		return uniqeInstance;
	}
	public static  Singleton getInstance3() {
		if(uniqeInstance==null) {
			synchronized (Singleton.class) {
				if(uniqeInstance==null) {// 进入之后再检查一次，防止在进入的过程中又有线程安全的问题
				uniqeInstance=new Singleton();
				}
			}
		}
		return uniqeInstance;
	}


}
