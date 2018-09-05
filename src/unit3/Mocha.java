/**
 * 
 */
package unit3;

/**
 * Ħ��װ����
 * @author Stone
 *
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage; //Ҫװ�ε����,�˷����õ���ί�л���
	/**
	 * ί�ɺͼ̳ж���Ϊ����ߴ���ĸ����ԣ�ֻ�Ƿ�ʽ��ͬ��
		ί�ɣ�һ������������һ������Ĺ��ܣ�����һ�����������䷢�͵���һ������
		�̳У�����extends����չһ������
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
