/**
 * 
 */
package decoratorpattern;

/**
 * @author Stone
 *Espresso  n. （用汽加压煮出的）浓咖啡
 */
public class Espresso extends Beverage {

	public Espresso() {
		description="Espresso";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 5.50;
	}

}
