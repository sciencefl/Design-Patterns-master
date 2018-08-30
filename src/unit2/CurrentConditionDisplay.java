package unit2;

import java.time.Period;

public class CurrentConditionDisplay implements Observer,DisplayElement {

	private float temperature;
	private float humidity;
//	private float pressure;
	private Subject weatherData;
	//�����������г�ʼ�����۲��߳�ʼ��Ҫ����������� ע�ᵽ  ����
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this); //this ����ָ��ǰ�����Լ�
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
