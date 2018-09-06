package decoratorpattern;
/**
 * 
 * @author Stone
 * Soy n. 大豆；酱油
 */
public class Soy extends CondimentDecorator {

	Beverage beverage; //要装饰的组件,此方法用到了委托机制
	/**
	 * 委派和继承都是为了提高代码的复用性，只是方式不同。
		委派：一个对象请求另一个对象的功能，捕获一个操作并将其发送到另一个对象。
		继承：利用extends来扩展一个基类
	 */
	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}


	@Override
	public String getDescription() {
		return beverage.getDescription()+",Soy";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+3.00;
	}

}
