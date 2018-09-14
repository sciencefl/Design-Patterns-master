package commandpattern.remote;

public class RemoteControlTest {

	public RemoteControlTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl(); //初始化一个遥控器
		Light light=new Light();  //有了一个灯
		Command remote=new LightOnCommand(light); // 初始化一个命令,并绑定receiver
		//利用命令来参数化对象
		simpleRemoteControl.setCommand(remote); //给遥控器绑定命令  --给顾客一个订单
		simpleRemoteControl.buttonWasPressed();
		GarageDoor garageDoor=new GarageDoor(null);
		Command garageDoorOpenCommand=new GarageDoorOpenCommand(garageDoor);
		simpleRemoteControl.setCommand(garageDoorOpenCommand);
		simpleRemoteControl.buttonWasPressed();
	}

}
