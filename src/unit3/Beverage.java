package unit3;
/**
 * 为什么要设计成一个抽象类，而不是一个接口
 * 自认为：首先他是一个对象，而接口更倾向于行为，所以用抽象类，而接口的设计过程一般是自顶向下，而抽象类的设计过程是自底向上
 * 书中：1、给的代码已经是抽象类。2、通常装饰者模式用的是抽象类，而java可用接口实现。3.通常避免修改现有代码
 * @author Stone
 *Beverage 是饮料的意思
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	public String getDescription() {
		return this.description;
	}
	 public abstract double cost(); 

}
