package unit1;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
		
	}
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
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
