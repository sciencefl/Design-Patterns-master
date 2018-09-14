package commandpattern.remote;
/**
 * 遥控器类 ，相当于client
 * @author Stone
 *
 */
public class SimpleRemoteControl {
	Command  slot;
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
		
	}
	public void setCommand(Command slot) {
		this.slot=slot;
	}
	public  void buttonWasPressed() {
		slot.execute();
	}

}
