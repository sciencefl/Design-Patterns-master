/**
 * 
 */
package decoratorpattern;

/**
 * Condiment �ǵ��ϵ���˼
 * װ���ߵĳ����࣬�̳�Beverage
 * @author Stone
 *
 */
public abstract class CondimentDecorator extends Beverage {
	//����װ���߶�����ʵ��һ���µ�getDescription ����
	//����һ�� abstract cost���������ȴ�ȥʵ�֣����Ը���
	public abstract String getDescription();
}
