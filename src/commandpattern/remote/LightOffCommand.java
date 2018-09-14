package commandpattern.remote;

public class LightOffCommand implements Command {

	Light light;
	public LightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light=light;
	}
     // orderUp
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();

	}
}
