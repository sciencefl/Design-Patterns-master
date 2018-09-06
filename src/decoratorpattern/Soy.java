package decoratorpattern;
/**
 * 
 * @author Stone
 * Soy n. �󶹣�����
 */
public class Soy extends CondimentDecorator {

	Beverage beverage; //Ҫװ�ε����,�˷����õ���ί�л���
	/**
	 * ί�ɺͼ̳ж���Ϊ����ߴ���ĸ����ԣ�ֻ�Ƿ�ʽ��ͬ��
		ί�ɣ�һ������������һ������Ĺ��ܣ�����һ�����������䷢�͵���һ������
		�̳У�����extends����չһ������
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
