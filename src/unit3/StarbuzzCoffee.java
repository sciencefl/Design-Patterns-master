package unit3;

public class StarbuzzCoffee {

	public StarbuzzCoffee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Beverage beverage=new Espresso(); //һ���µĿ���
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		Beverage beverage2=new DarkRoast();//һ���س�����
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		beverage2=new Mocha(beverage2);  // һ������Ħ���Ŀ���  ����Ϊʲôװ����ΪʲôҪ�̳б�װ���ߵ�ԭ��
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		beverage2=new Soy(beverage2);
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		//����ֻ�ǶԶ�������ñ��ˣ����Ƕ�����Ȼ���ڵģ����Կ���ʵ��

	}

}
