package unit3;

public class StarbuzzCoffee {

	public StarbuzzCoffee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Beverage beverage=new Espresso(); //一杯新的咖啡
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		Beverage beverage2=new DarkRoast();//一杯重炒咖啡
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		beverage2=new Mocha(beverage2);  // 一杯加了摩卡的咖啡  这是为什么装饰者为什么要继承被装饰者的原因
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		beverage2=new Soy(beverage2);
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		//以上只是对对象的引用变了，但是对象仍然存在的，所以可以实现

	}

}
