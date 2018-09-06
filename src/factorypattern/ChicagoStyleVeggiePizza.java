package factorypattern;

public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza() {
		// TODO Auto-generated constructor stub
		name="Chicago Style Pizza";
		dough="Extra Thick Crust Dough";
		sauce="Chicago Sauce";
		toppings.add("Chicago Cheese");
	}
	@Override
	void cut() { //������cut�ķ������г�������
		System.out.println("Cutting the pizza into cirle slices");
	}

}
