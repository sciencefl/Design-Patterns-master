/**
 * 
 */
package unit1;

/**
 * @author Stone
 *
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard =new MallardDuck();
		mallard.performFly();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
		mallard.performQuack();
		mallard.swim();
		mallard.display();

	}

}
