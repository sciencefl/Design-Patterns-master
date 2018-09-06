package factorypattern;

public class NYStylePizzaStore extends PizzaStore {
	
     @Override
     public Pizza createPizza(String type) {
    	 if(type.equals("cheese")) {
    		 pizza=new NYStyleCheesePizza();
    	 }else if(type.equals("Veggie")) {
    		 pizza=new NYStyleVeggiePizza();
    	 }
    	 return pizza;
     }
}
