package unit3;
/**
 * ΪʲôҪ��Ƴ�һ�������࣬������һ���ӿ�
 * ����Ϊ����������һ�����󣬶��ӿڸ���������Ϊ�������ó����࣬���ӿڵ���ƹ���һ�����Զ����£������������ƹ������Ե�����
 * ���У�1�����Ĵ����Ѿ��ǳ����ࡣ2��ͨ��װ����ģʽ�õ��ǳ����࣬��java���ýӿ�ʵ�֡�3.ͨ�������޸����д���
 * @author Stone
 *Beverage �����ϵ���˼
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	public String getDescription() {
		return this.description;
	}
	 public abstract double cost(); 

}
