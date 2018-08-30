/**
 * 
 */
package unit2;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author Stone
 *
 */
public class WeatherData implements Subject {

	private float temperature;
	private float pressure;
	private float humidity;
	private ArrayList observers; //存储所有的观察者
	public WeatherData() {
		observers=new ArrayList(); //
	}
	//注册观察者
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);  //Observer 类型的数据向上转型为object
	}
	//注销观察者
	@Override
	public void removeObserver(Observer observer) {
		int i=observers.indexOf(observer);
		if(i>=0) {
			observers.remove(i);
		}

	}
	//通知观察者
	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++) {
			Observer observer=(Observer)observers.get(i); //需要向下转型为observer;
			observer.update(temperature, humidity, pressure);
		}
	}
	//一旦数据改变，就会通知观察者
	public void measurementsChanged() {
		notifyObservers();
	}
	//更新数据的操作
	public  void setMeasurementsChanged(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}

}
