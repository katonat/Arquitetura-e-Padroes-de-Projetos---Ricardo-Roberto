
public class PressSwitch {
	
	public static void main(String[] args) {
		Light lamp = new Light();
		
		Command switchOn = new FlipUpCommand(lamp);
		Command switchOff = new FlipDownCommand(lamp);
		
		Switch mySwitch = new Switch();
		
		mySwitch.register("on", switchOn);
		mySwitch.register("off", switchOff);
		
		mySwitch.execute("on");
		mySwitch.execute("off");

	}
}
