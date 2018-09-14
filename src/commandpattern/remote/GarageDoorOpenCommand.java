package commandpattern.remote;

public class GarageDoorOpenCommand implements Command {
	GarageDoor  garageDoor;
	//��receiver
	public GarageDoorOpenCommand(GarageDoor  garageDoor) {
		// TODO Auto-generated constructor stub\
		this.garageDoor=garageDoor;
	}
	@Override
	public void execute() {
		garageDoor.up();
	}

}
