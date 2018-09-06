package factorypattern;
 /**
  * 简单工厂模式，只用来创建工厂
  */
public class SimplePizzaFactory {
	Pizza pizza=null;
	public Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			pizza=new NYStyleCheesePizza();
		}else if(type.equals("clam")) {
			pizza=new ChicagoStyleCheesePizza();
		}
		return pizza;
	}

}
