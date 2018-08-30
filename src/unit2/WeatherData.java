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
	private ArrayList observers; //�洢���еĹ۲���
	public WeatherData() {
		observers=new ArrayList(); //
	}
	//ע��۲���
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);  //Observer ���͵���������ת��Ϊobject
	}
	//ע���۲���
	@Override
	public void removeObserver(Observer observer) {
		int i=observers.indexOf(observer);
		if(i>=0) {
			observers.remove(i);
		}

	}
	//֪ͨ�۲���
	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++) {
			Observer observer=(Observer)observers.get(i); //��Ҫ����ת��Ϊobserver;
			observer.update(temperature, humidity, pressure);
		}
	}
	//һ�����ݸı䣬�ͻ�֪ͨ�۲���
	public void measurementsChanged() {
		notifyObservers();
	}
	//�������ݵĲ���
	public  void setMeasurementsChanged(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}

}
