package unit2;

import java.time.Period;

public class CurrentConditionDisplay implements Observer,DisplayElement {

	private float temperature;
	private float humidity;
//	private float pressure;
	private Subject weatherData;
	//构造器，进行初始化，观察者初始化要做的事情就是 注册到  主题
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this); //this 就是指当前对象自己
	}
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature=temp;
		this.humidity=humidity;
//		this.pressure=pressure;
		display();
	}
	@Override
	public void display() {
		System.out.println("Current conditions:"+temperature+"C dgrees and "+humidity+"% humidity");
	}

}
