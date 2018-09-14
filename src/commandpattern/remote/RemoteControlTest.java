package commandpattern.remote;

public class RemoteControlTest {

	public RemoteControlTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl(); //��ʼ��һ��ң����
		Light light=new Light();  //����һ����
		Command remote=new LightOnCommand(light); // ��ʼ��һ������,����receiver
		//��������������������
		simpleRemoteControl.setCommand(remote); //��ң����������  --���˿�һ������
		simpleRemoteControl.buttonWasPressed();
		GarageDoor garageDoor=new GarageDoor(null);
		Command garageDoorOpenCommand=new GarageDoorOpenCommand(garageDoor);
		simpleRemoteControl.setCommand(garageDoorOpenCommand);
		simpleRemoteControl.buttonWasPressed();
	}

}
