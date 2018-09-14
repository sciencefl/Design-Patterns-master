package commandpattern.remote;
/**
 * 厂商给的Light类
 * 相当于    receiver
 * @author Stone
 *
 */
public class Light {
	 //String  location;
	int level;
	public Light() {
		// TODO Auto-generated constructor stub
	}
	public void on() {
		level=100;
		System.out.println("Light is on");
	}
	public void off() {
		level=0;
		System.out.println("Light is off");
	}
	public void dim(int level) {
		this.level=level;
		if(level==0) {
			off();
		}else {
			System.out.println("The light is dimed to "+level+"%");
		}
	}
	public int getLevel() {
		return level;
	}

}
