package decoratorpattern;
/**
 * 
 * @author Stone
 * DarkRoast �س�
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		description="DarkRoast";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 6.50;
	}

}
