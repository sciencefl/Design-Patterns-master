package factorypattern;

public abstract class PizzaStore {
	
	
	Pizza pizza=null;
	public  Pizza orderPizza(String type) {
		pizza=this.createPizza(type);  //把new操作符替换成工厂创建方法，不再使用具体实例化。
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	//工厂方法用来处理对象的创建，并将这样的行为封装在子类中。这样，超类的代码就和子类对象的创建代码解耦了。所以采用抽象方法
	public abstract Pizza createPizza(String type);

}
