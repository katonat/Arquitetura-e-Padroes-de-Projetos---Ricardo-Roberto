
public class AdaptadorNintendo64ParaPS5 extends SensorNintendo64 {
	
	SensorPS5 adapt = new SensorPS5();
	
	public AdaptadorNintendo64ParaPS5(SensorPS5 adapt) {
		this.adapt = adapt;
	}
	
	public void conectarNintendo64() {
		adapt.conectarPS5();
		System.out.println("Dale Mario.");
	}

}
