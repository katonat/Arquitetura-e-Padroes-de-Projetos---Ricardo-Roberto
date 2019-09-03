
public class Main {
	

	public static void main(String[] args) {
		
		SensorXbox2 adaptee = new SensorXbox2();
		ControlePS5 target = new ControlePS5();
		AdaptadorPS5ParaXbox2 adapter = new AdaptadorPS5ParaXbox2(adaptee);

		
		SensorPS5 adaptee1 = new SensorPS5();
		ControleNintendo64 target1 = new ControleNintendo64();
		AdaptadorNintendo64ParaPS5 adapter1 = new AdaptadorNintendo64ParaPS5(adaptee1);
		
		target.Conectar(adapter);
		
		target1.Conectar(adapter1);
	}

}
