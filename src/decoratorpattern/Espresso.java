/**
 * 
 */
package decoratorpattern;

/**
 * @author Stone
 *Espresso  n. ��������ѹ����ģ�Ũ����
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
