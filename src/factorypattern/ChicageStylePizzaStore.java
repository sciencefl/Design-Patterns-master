package factorypattern;

public class ChicageStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
   	 	if(type.equals("cheese")) {
   	 		pizza=new ChicagoStyleCheesePizza();
   	 	}else if(type.equals("Veggie")) {
   	 		pizza=new ChicagoStyleVeggiePizza();
   	 	}
   	 	return pizza;
	}
}
