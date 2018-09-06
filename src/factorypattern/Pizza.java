/**
 * 
 */
package factorypattern;

import java.util.ArrayList;

/**
 * ����Pizza�ĳ�����
 * @author Stone
 *
 */
public abstract class Pizza {

	/**
	 * 
	 */
	protected String name;
	protected String dough; //����
	protected String sauce; //n. ���ͣ�ɳ˾����ζ֭
	ArrayList<String>  toppings=new ArrayList<String>(); //n. ����ϵ�װ�����ϣ����ɶ����Ķ��������������޼�����
	void prepare() {
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for(int i=0;i<toppings.size();i++) {
			System.out.println("  "+toppings.get(i));
		}
	}
	//vt. �����決
	void bake() {  
		System.out.println("Bake for 24 minutes at 350");
	}
	void cut() {  // ��Ƭ
		System.out.println("Cutting the pizza into digonal slices");
	}
	void box() {  //vt. ȭ����װ�������
		System.out.println("Place pizza in offical PizzaStore box");
	}
	public String getName() {
		return name;
	}
	

}
