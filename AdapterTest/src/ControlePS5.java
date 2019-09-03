
public class ControlePS5 {
	
	private SensorPS5 sensorAqueSeConecta;
	
	public void Conectar(SensorPS5 sensor) {
		this.sensorAqueSeConecta = sensor;
		sensorAqueSeConecta.conectarPS5();
	}

}
