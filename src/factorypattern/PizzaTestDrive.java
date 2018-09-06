package factorypattern;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore=new NYStylePizzaStore();
		PizzaStore chPizzaStore=new ChicageStylePizzaStore();
		Pizza pizza=nyStore.orderPizza("cheese"); //点了一个pizza
		System.out.println("New  York--------------------------------- :"+pizza.getName());
		pizza=chPizzaStore.orderPizza("cheese");
		System.out.println("Chicage------------------------------------- :"+pizza.getName());

	}

}
