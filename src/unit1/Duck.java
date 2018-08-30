package unit1;
/*
 * 策略模式定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。
 * （封装：每个对象都包含它能进行操作的所有信息，这个特性称为封装，因此对象就不必依赖其他对象来完成操作）
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
