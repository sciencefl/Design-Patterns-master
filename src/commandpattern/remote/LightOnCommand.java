package commandpattern.remote;
/**
 * command
 * @author Stone
 *
 */
public class LightOnCommand implements Command {
	Light light;
	public LightOnCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light=light;
	}
     // orderUp
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();

	}

}
