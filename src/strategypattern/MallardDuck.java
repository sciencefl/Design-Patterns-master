package strategypattern;

import java.util.Observable;

import observerpattern.Observer;

public class MallardDuck extends Duck {
	public MallardDuck() {
		flyBehavior=new FlyWithWings();
		quackBehavior=new Quack();
	}
	public void display() {
		System.out.println("I am a MallardDuck!");
	}
}
