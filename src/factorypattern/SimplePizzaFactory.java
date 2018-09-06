package factorypattern;
 /**
  * �򵥹���ģʽ��ֻ������������
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
