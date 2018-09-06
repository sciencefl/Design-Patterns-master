package factorypattern;

public abstract class PizzaStore {
	
	
	Pizza pizza=null;
	public  Pizza orderPizza(String type) {
		pizza=this.createPizza(type);  //��new�������滻�ɹ�����������������ʹ�þ���ʵ������
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	//�������������������Ĵ�����������������Ϊ��װ�������С�����������Ĵ���ͺ��������Ĵ�����������ˡ����Բ��ó��󷽷�
	public abstract Pizza createPizza(String type);

}
