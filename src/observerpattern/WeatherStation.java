package observerpattern;
/**
 * 定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的依赖者都能接收到通知并自动更新。
 * 订阅者+出版者=观察者模式   （报社订阅报纸的例子）
 */
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData=new WeatherData(); //有一个数据中心
		//需要哪些布告板就创建哪些布告板，并把布告板注册到主题
		CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurementsChanged(34, 50, 0);
	
		
	}

}
