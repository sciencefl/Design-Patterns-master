/**
 * 
 */
package factorypattern;

import java.util.ArrayList;

/**
 * 所有Pizza的抽象类
 * @author Stone
 *
 */
public abstract class Pizza {

	/**
	 * 
	 */
	protected String name;
	protected String dough; //面团
	protected String sauce; //n. 酱油；沙司；调味汁
	ArrayList<String>  toppings=new ArrayList<String>(); //n. 糕点上的装饰配料；构成顶部的东西；除顶部；修剪树稍
	void prepare() {
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for(int i=0;i<toppings.size();i++) {
			System.out.println("  "+toppings.get(i));
		}
	}
	//vt. 烤，烘焙
	void bake() {  
		System.out.println("Bake for 24 minutes at 350");
	}
	void cut() {  // 切片
		System.out.println("Cutting the pizza into digonal slices");
	}
	void box() {  //vt. 拳击；装…入盒中
		System.out.println("Place pizza in offical PizzaStore box");
	}
	public String getName() {
		return name;
	}
	

}
