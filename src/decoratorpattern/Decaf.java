/**
 * 
 */
package decoratorpattern;

/**
 * @author Stone
 *Decaf  n. 无咖啡因咖啡；脱因咖啡（等于decaffeinated coffee）
 */
public class Decaf extends Beverage {

	/**
	 * 
	 */
	public Decaf() {
		description="Decat Coffee";
	}

	/* (non-Javadoc)
	 * @see unit3.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 7.50;
	}

}
