package decoratorpattern;
/**
 * 
 * @author Stone
 * Whip     vt. ���ɿ�������򣨵������ͣ�
 */
public class Whip extends CondimentDecorator {

	Beverage beverage; //Ҫװ�ε����,�˷����õ���ί�л���
	/**
	 * ί�ɺͼ̳ж���Ϊ����ߴ���ĸ����ԣ�ֻ�Ƿ�ʽ��ͬ��
		ί�ɣ�һ������������һ������Ĺ��ܣ�����һ�����������䷢�͵���һ������
		�̳У�����extends����չһ������
	 */
	public Whip(Beverage beverage) {
		this.beverage=beverage;
	}


	@Override
	public String getDescription() {
		return beverage.getDescription()+",Whip";
	}
	@Override
	public double cost() {
		return beverage.cost()+2.00;
	}

}
