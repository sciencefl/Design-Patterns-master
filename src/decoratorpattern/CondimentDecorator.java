/**
 * 
 */
package decoratorpattern;

/**
 * Condiment 是调料的意思
 * 装饰者的抽象类，继承Beverage
 * @author Stone
 *
 */
public abstract class CondimentDecorator extends Beverage {
	//所有装饰者都必须实现一个新的getDescription 方法
	//还有一个 abstract cost（）方法等待去实现，来自父类
	public abstract String getDescription();
}
