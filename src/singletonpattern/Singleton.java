package singletonpattern;
/**
 * ����ģʽ��ȷ��һ����ֻ��һ��ʵ�������ṩһ��ȫ�ַ��ʵ�
 * ����ģʽ��ȷ���̰߳�ȫ�ķ���
	1.ͬ��getinstance��������
	���getinstance�������������ܶ�Ӧ�ó����Ǻܹؼ�������ʲô������
	2.����ʵ����
	�ڶ��徲̬������ʱ��ֱ�ӳ�ʼ�����������ӳٳ�ʼ���ķ���
	3.˫�ؼ�����
	���ȼ���Ƿ�ʵ���Ѿ������ˣ����û�д��������š�����һ��ͬ����������ֻ��һ��ͬ����������������Ҫ�ġ�
	����ģʽ�ر���Ҫ��
	1.һ��˽�еĹ����������ڳ�ʼ������һ��˽�еľ�̬��̬�Ķ��������һ��ȫ�ֵľ�̬������
 * @author Stone
 *
 */
public class Singleton {
	
	private  static  volatile Singleton uniqeInstance; //��Ϊ��̬����ֻ�ܷ��ʾ�̬�����;�̬���� 
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton getInstance0() {
		if(uniqeInstance==null) {
			uniqeInstance=new Singleton();
		}
		return uniqeInstance;
	}
	public static synchronized Singleton getInstance1() {
		if(uniqeInstance==null) {
			uniqeInstance=new Singleton();
		}
		return uniqeInstance;
	}
	public static  Singleton getInstance3() {
		if(uniqeInstance==null) {
			synchronized (Singleton.class) {
				if(uniqeInstance==null) {// ����֮���ټ��һ�Σ���ֹ�ڽ���Ĺ����������̰߳�ȫ������
				uniqeInstance=new Singleton();
				}
			}
		}
		return uniqeInstance;
	}


}
