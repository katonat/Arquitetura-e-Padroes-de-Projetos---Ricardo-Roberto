
public class Computer {
	
	private Cpu cpu;
	private Memory memory;
	private HardDrive harddrive;
	private Webcam webcam;
	private Printer printer;
	
	public Computer() {
		this.cpu = new Cpu();
		this.memory = new Memory();
		this.harddrive = new HardDrive();
		
		this.webcam = new Webcam();
		this.printer = new Printer();
	}
	
	public void startComputer() {
		cpu.freeze();
		memory.load(12, harddrive.read(13, 3));
		cpu.jump(12);
		cpu.execute();
		webcam.startConnection();
		printer.startPool();
	}
}
