package unit1;
/*
 * ����ģʽ�������㷨�壬�ֱ��װ������������֮������໥�滻����ģʽ���㷨�ı仯������ʹ���㷨�Ŀͻ���
 * ����װ��ÿ�����󶼰������ܽ��в�����������Ϣ��������Գ�Ϊ��װ����˶���Ͳ�������������������ɲ�����
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
		
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack()  {
		quackBehavior.quack();
	}
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior=fb;
	}
	public abstract void display();
	public void swim() {
		System.out.println("All Duck can float,even swim~~~");
	}

}
