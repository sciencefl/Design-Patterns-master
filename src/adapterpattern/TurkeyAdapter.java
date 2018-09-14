package adapterpattern;
// 首先要实现想转换成的类型接口
public class TurkeyAdapter implements Duck {
	Turkey turkey;
	public TurkeyAdapter(Turkey turkey) {
		// TODO Auto-generated constructor stub
		//要取得要适配的对象的引用
		this.turkey=turkey;
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			turkey.fly();
		}

	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();

	}

}
