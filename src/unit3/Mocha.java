/**
 * 
 */
package unit3;

/**
 * 摩卡装饰器
 * @author Stone
 *
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage; //要装饰的组件,此方法用到了委托机制
	/**
	 * 委派和继承都是为了提高代码的复用性，只是方式不同。
		委派：一个对象请求另一个对象的功能，捕获一个操作并将其发送到另一个对象。
		继承：利用extends来扩展一个基类
	 */
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+",Mocha";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+2.00;
	}

}
