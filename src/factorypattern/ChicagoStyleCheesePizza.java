package factorypattern;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		// TODO Auto-generated constructor stub
		name="Chicago Style Pizza";
		dough="Extra Thick Crust Dough";
		sauce="Chicago Sauce";
		toppings.add("Chicago Cheese");
	}
	@Override
	void cut() { //������cut�ķ������г�������
		System.out.println("Cutting the pizza into sqaure slices");
	}

}
