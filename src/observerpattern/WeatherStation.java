package observerpattern;
/**
 * �����˶���֮���һ�Զ�����������һ������һ������ı�״̬ʱ�����������߶��ܽ��յ�֪ͨ���Զ����¡�
 * ������+������=�۲���ģʽ   �����綩�ı�ֽ�����ӣ�
 */
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData=new WeatherData(); //��һ����������
		//��Ҫ��Щ�����ʹ�����Щ����壬���Ѳ����ע�ᵽ����
		CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurementsChanged(34, 50, 0);
	
		
	}

}
